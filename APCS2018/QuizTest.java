import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class QuizTest implements ActionListener {
   private int y;
      
   // public static void link(JFrame f, Scanner input, JButton b) {
//       addQuestion(f, input);
//       
//    }
   
   //question appears at top so the user is unable to interact with it and change it
   
   public Button(JFrame f, Scanner input, int y) {
      String answer = input.next();
      String answer2 = input.next();
      JButton b=new JButton(answer); 
      this.y = y;
      b.setBounds(50,this.y,95,30); 
     
      f.add(b);  
      
      f.setLayout(null);  
      f.setVisible(true);
      b.setActionCommand("disable");
      b.addActionListener(this);    
      //b.clearScreen();
      //return b;
   }
   
   public void actionPerformed(ActionEvent e) {
      if("disable".equals(e.getActionCommand()) {
         b.setEnabled(true);
      }
   }
   
   public static void addQuestion(JFrame f, Scanner input) { 
      int temp = input.nextInt();
      String question = input.nextLine(); 
      JLabel l1;  
      l1=new JLabel(question);  
      l1.setBounds(25, 25, 1500, 25);   
      l1.setFont(new Font("Monaco", Font.PLAIN, 25));
      f.add(l1);    
      f.setLayout(null);  
      f.setVisible(true);   
   }
   
   //answers to questions will appear on buttons so when the user clicks on it
   //the screen will clear and move onto the next question
  //  public static JButton createButton(JFrame f, Scanner input, int y) {
//       String answer = input.next();
//       String answer2 = input.next();
//       JButton b=new JButton(answer); 
//       b.setBounds(50,y,95,30); 
//      
//       f.add(b);  
//       
//       f.setLayout(null);  
//       f.setVisible(true);    
//       //b.clearScreen();
//       return b;
//    } 
   
      
   public static void clearScreen(JFrame f, JButton b) {
   
      b.addActionListener (
         new ActionListener() {  
            public void actionPerformed(ActionEvent e){ 
               //clears screen to allow for next question to appear 
               f.removeAll(); 
               f.repaint();              
               //f.validate(); 
            
            }  
         });
   };
   
   
   public static void main(String[] args) throws FileNotFoundException {
      
      Scanner input = new Scanner(new File("CatQuestions.txt"));
     
      JFrame f=new JFrame("Which Cat or Dog Should You Make Your Parents Buy?");
      f.setSize(1500, 1000);
      //JButton b = createButton(f, input);
      //link(f, input, b);
      addQuestion(f, input);
      JButton b = createButton(f, input, 100);  
      if(b.getModel().isSelected()) {
         clearScreen(f, b);
         //System.out.print("yes");
      }
   
      //clearScreen(f, b);  
   } 

        
}

