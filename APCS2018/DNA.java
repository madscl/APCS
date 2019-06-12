/*Name: Madeleine Clore
Date: 5 March, 2019
Assignment: DNA.java
Description: Use arrays, reading from a file, and printstream to read a dna
             sequence from a file to determine if the sequence fits criteria that
             makes it a protein and prints the information to a file.*/
             
import java.util.*;
import java.io.*;

public class DNA {
   public static final int CODONS = 4;
   public static final int MASS = 30;
   public static final int UNIQUE = 4;
   public static final int NUCLEOTIDES = 3;
   public static void main(String[] args) 
      throws FileNotFoundException {
      
      Scanner console = new Scanner(System.in);
      String[] files = askFiles(console);
      Scanner input = new Scanner(new File(files[0]));
      PrintStream output = new PrintStream(new File(files[1]));
      //loops through until the end of the file
      while(input.hasNextLine()) {
         String name = input.nextLine();
         String nucleotides = input.nextLine();
         nucleotides = nucleotides.toUpperCase();
         String[] nucleotidesArray = convertToArray(nucleotides);
         int[] counts = countNucleotides(nucleotidesArray);
         double[] percentages = findMass(counts);
         String[] codons = findCodons(nucleotides);
         String protein = isProtein(nucleotides, codons, percentages);
         printData(output, name, nucleotides, counts, percentages, codons, protein);
      }
   }
   
   //gets user input for the file names
   public static String[] askFiles(Scanner console) 
      throws FileNotFoundException {
      
      String[] files = new String[2];
      System.out.print("Input file name? ");
      files[0] = console.next();
      System.out.print("Output file name? ");
      files[1] = console.next();
      return files;
   }
   
   /*converts the nucleotide string read from the file to an array of single
     character strings*/
   public static String[] convertToArray(String nucleotides) {
      int length = nucleotides.length();
      String[] nucleotidesArray = new String[length];
      for(int i = 0; i < length; i++) {
         nucleotidesArray[i] = nucleotides.substring(i, i + 1);
      }
      return nucleotidesArray;
   }
   
   /*counts the nucleotides (a,c,g,t) and puts the number for each nucleotide
     into an int array in the corresponding order of a,c,g,t*/
   public static int[] countNucleotides(String[] nucleotidesArray) {
      int[] counts = new int[UNIQUE];
      for(String letter: nucleotidesArray) {
         if(letter.equalsIgnoreCase("a")) {
            counts[0]++;
         } else if(letter.equalsIgnoreCase("c")) {
            counts[1]++;
         } else if(letter.equalsIgnoreCase("g")) {
            counts[2]++;
         } else if(letter.equalsIgnoreCase("t")) {
            counts[3]++;
         }
      } 
      return counts;
   }
   
   /*finds the proportionate percentage of mass that each nucleotide represents
     for the whole sequence*/
   public static double[] findMass(int[] counts) {
      double[] percentages = new double[UNIQUE];
      double total = 0;
      int i = 0;
      int j = 0;
      double[] masses = {135.128, 111.103, 151.128, 125.107};
      //gets the total mass for subsequent calculations
      for(int x: counts) {
         total += x * masses[i];
         i++;
      }
      //calculates the proportionate percentage for each nucleotide
      for(double x: masses) {
         double value = (x * counts[j]) / total;
         percentages[j] = (Math.round(value * 1000)) / 10.0;
         j++;
      }  
      return percentages;       
   }
   
   //goes through the string of nucleotides and splits it into groups of NUCLEOTIDES
   public static String[] findCodons(String nucleotides) {
      String[] codons = new String[nucleotides.length() / NUCLEOTIDES];
      for(int i = 0; i < nucleotides.length() / NUCLEOTIDES; i++) {
         codons[i] = nucleotides.substring(i * NUCLEOTIDES, i * NUCLEOTIDES + NUCLEOTIDES);
      }
      return codons;
   }
   
   //determines if it's a protein or not based on guided parameters
   public static String isProtein(String nucleotides, String[] codons, double[] percentages) {
      String protein = "";
      if(nucleotides.startsWith("ATG") && (nucleotides.endsWith("TAA") || 
      nucleotides.endsWith("TAG")|| nucleotides.endsWith("TGA")) && codons.length >= 
      CODONS && (percentages[1] + percentages[2] >= MASS)) {
         protein = "yes";
      } else {
         protein = "no";
      }
      return protein;
   }
   
   /*prints to the file all of the data collected from the previous methods
     (name, nucleotides, counts, percentages, codons, if it encodes a protien)*/
   public static void printData(PrintStream out, String name, String nucleotides,
   int[] counts, double[] percentages, String[] codons, String protein) {
      out.println("Name: " + name);
      out.println("Nucleotides: " + nucleotides);
      out.println("Nucleotide counts: " + Arrays.toString(counts));
      out.println("Mass percentages: " + Arrays.toString(percentages));
      out.println("Codons: " + Arrays.toString(codons));
      out.println("Encodes a protein: " + protein);
      out.println();
   }
}