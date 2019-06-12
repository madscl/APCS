import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class DisplayTextTest implements ActionListener {
   private JFrame frame;
   private JPanel panel, panel2, panel3, panel4;
   private JButton b, b2, b3;
   private JLabel l;
   private Scanner inputCat, inputDog;
   private String question;
   private String a, a2, a3;
   private int jCat, jDog;
   private int animal;
      
   public DisplayTextTest() throws FileNotFoundException {
      
      inputDog = new Scanner(new File("DogQuestions.txt"));
      inputCat = new Scanner(new File("CatQuestions.txt"));
      
      jCat = findNumberAnswersCat(inputCat);
      jDog = findNumberAnswersDog(inputDog);
      
      question = "Do you prefer cats or dogs?";
      a = "Cats";
      a2 = "Dogs";
   
      frame = new JFrame("Which Cat or Dog Should You Make Your Parents Buy?");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      panel = new JPanel();
      panel2 = new JPanel();
      
      l =new JLabel(question);  
         
      b = new JButton(a);
      b2 = new JButton(a2);
      b.setBounds(150,150,600,200);
      b.addActionListener(this);
      b2.addActionListener(this);
      
      if(jCat== 2 || jDog == 2) {
         b3 = new JButton(a3);
         b3.addActionListener(this);
      }
       
      panel.add(l);
      panel.add(b);
      panel.add(b2);
            
      frame.setContentPane(panel);
      frame.setSize(700, 700);
      frame.setVisible(true);
      
   }
   
   public void linkCat(Scanner inputCat) {
      frame.remove(panel);
      question = getQuestion(inputCat);
      l =  new JLabel(question);
      b = new JButton(a);
      b2 = new JButton(a2);
      getAnswersCat(inputCat);
      panel2.add(l);
      panel2.add(b);
      panel2.add(b2); 
      if(jCat == 2) {
         b3 = new JButton(a3);
         panel2.add(b3);
      }
      frame.setContentPane(panel2);  
   }
   
   public void linkDog(Scanner inputDog) {
      frame.remove(panel);
      question = getQuestion(inputCat);
      l =  new JLabel(question);
      b = new JButton(a);
      b2 = new JButton(a2);
      getAnswersCat(inputCat);
      panel2.add(l);
      panel2.add(b);
      panel2.add(b2); 
      if(jDog == 2) {
         b3 = new JButton(a3);
         panel2.add(b3);
      }
      frame.setContentPane(panel2);  
   }

   
   public void actionPerformed(ActionEvent e){
      JButton button = (JButton) e.getSource();
      if(button == b) {
         animal = 1;
         linkCat(inputCat);
         // if(button == b) {
      //             
      //           }
                 
      } else if(button == b2) {
         animal = -1;
         frame.remove(panel);
         frame.setContentPane(panel2);
         panel2.add(l);
         panel2.add(b);
         panel2.add(b2);
      }else {
         frame.remove(panel);
         frame.setContentPane(panel2);
      }
      frame.validate();
      frame.repaint();
   }
      
   public String getQuestion(Scanner input) {
      String question = input.nextLine();
      return question;
      //System.out.print(question);
   }
   
   public int findNumberAnswersCat(Scanner input) {
      String temp = input.nextLine();
      for(int i = 0; i < temp.length(); i++) {
         if(Character.isWhitespace(temp.charAt(i))) {
            jCat++;
         }
      }
      return jCat;
   }
   
   public int findNumberAnswersDog(Scanner input) {
      String temp = input.nextLine();
      for(int i = 0; i < temp.length(); i++) {
         if(Character.isWhitespace(temp.charAt(i))) {
            jDog++;
         }
      }
      return jDog;
   }


   
   public void getAnswersCat(Scanner input) {
      String temp = input.nextLine();
      int number = findNumberAnswersCat(input);
      a = temp.substring(0, temp.indexOf(" "));
      temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
      if(jCat == 2) {
         a2 = temp.substring(0, temp.indexOf(" "));
         temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
         a3 = temp.substring(0, temp.length());
      } else { 
         temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
         a2 = temp.substring(0, temp.length());      }
       
   }
   

   public static void main(String[] args) throws FileNotFoundException {
      new DisplayTextTest();
   //      //  SwingUtilities.invokeLater(
   //    //          new Runnable() {
   //    //             @Override
   //    //             public void run()  {
   //    //                new DisplayTextTest();
   //    //             }
   //    //          });
   }
}