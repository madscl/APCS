import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class QuizTest2 implements ActionListener {
   private JFrame frame;
   private JPanel panel, panel2, panel3, panel4, panel5, panel6, panel7;
   private JButton b, b2, b3;
   private JLabel l;
   private Scanner inputCat, inputDog;
   private String question;
   private String a, a2, a3;
   private int j;
   private int animal;
   
   public QuizTest2() throws FileNotFoundException {
      
      inputDog = new Scanner(new File("DogQuestions.txt"));
      inputCat = new Scanner(new File("CatQuestions.txt"));
      
      j = findNumberAnswers(inputCat, inputDog);
      
      question = "Do you prefer cats or dogs?";
      a = "Cats";
      a2 = "Dogs";
   
      frame = new JFrame("Which Cat or Dog Should You Make Your Parents Buy?");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      panel = new JPanel();
      panel2 = new JPanel();
      panel3 = new JPanel();
      panel4 = new JPanel();
      panel5 = new JPanel();
      panel6 = new JPanel();
      panel7 = new JPanel();
      
      l =new JLabel(question);  
         
      b = new JButton(a);
      b2 = new JButton(a2);
      b.setBounds(150,150,600,200);
      b.addActionListener(this);
      b2.addActionListener(this);
      
      if(j== 2 || j == 2) {
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
      
   public void link(Scanner inputCat, Scanner inputDog, JPanel panelO, JPanel panelN) {
      frame.remove(panelO);
      if(animal == 1) {
         question = getQuestion(inputCat);
         getAnswers(inputCat, inputDog);
      } else if(animal == -1) {
         question = getQuestion(inputDog);
         getAnswers(inputCat, inputDog);
      }
      l =  new JLabel(question);
      b = new JButton(a);
      b2 = new JButton(a2);
      b.addActionListener(this);
      b2.addActionListener(this);
      panelN.add(l);
      panelN.add(b);
      panelN.add(b2); 
      if(j == 2) {
         b3 = new JButton(a3);
         b3.addActionListener(this);
         panelN.add(b3);
      }
      frame.setContentPane(panelN);  
      
   }
   
   
   public void actionPerformed(ActionEvent e){
      //if user says they prefer cats
      JButton button = (JButton) e.getSource();
      if(button == b) {
         animal = 1;
         link(inputCat, inputDog, panel, panel2);
         frame.validate();
         frame.repaint();
      
         JButton button2 = (JButton) e.getSource();
         if(button2 == b) {
            link(inputCat, inputDog, panel2, panel3);
            frame.validate();
            frame.repaint();
            if(button == b) {
               link(inputCat, inputDog, panel3, panel4);
            }
               
         }
      //if user says they prefer dogs      
      } else if(button == b2) {
         animal = -1;
         link(inputCat, inputDog, panel, panel2);
         frame.validate();
         frame.repaint();
      // }else {
      //          frame.remove(panel);
      //          frame.setContentPane(panel2);
      }
       // frame.validate();
   //        frame.repaint();
   }
      
   public String getQuestion(Scanner input) {
      String question = input.nextLine();
      return question;
      //System.out.print(question);
   }
   
   public int findNumberAnswers(Scanner inputCat, Scanner inputDog) {
      String temp = "";
      if(animal == 1) {
         temp = inputCat.nextLine();
      } else {
         temp = inputDog.nextLine();
      }
      for(int i = 0; i < temp.length(); i++) {
         if(Character.isWhitespace(temp.charAt(i))) {
            j++;
         }
      }
      return j;
   }
      
   public void getAnswers(Scanner inputCat, Scanner inputDog) {
      String temp = "";
      int number = 0;
      if(animal == 1) {
         temp = inputCat.nextLine();
      } else {
         temp = inputDog.nextLine();
      }
      number = findNumberAnswers(inputCat, inputDog);
      a = temp.substring(0, temp.indexOf(" "));
      temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
      if(j == 2) {
         a2 = temp.substring(0, temp.indexOf(" "));
         temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
         a3 = temp.substring(0, temp.length());
      } else { 
         temp = temp.substring(temp.indexOf(" ") + 1, temp.length());
         a2 = temp.substring(0, temp.length());      }
       
   }
   

   public static void main(String[] args) throws FileNotFoundException {
      new QuizTest2();
   //      //  SwingUtilities.invokeLater(
   //    //          new Runnable() {
   //    //             @Override
   //    //             public void run()  {
   //    //                new DisplayTextTest();
   //    //             }
   //    //          });
   }
}