import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class QuizFrame {
   public static void main(String[] args) {
   
      JFrame f=new JFrame("Which Cat or Dog Should You Make Your Parents Buy?");
      f.setSize(1500, 1000);
      addQuestion(f);
      createButton(f);
   
   } 
   
   //question appears at top so the user is unable to interact with it and change it
   public static void addQuestion(JFrame f) {  
      JLabel l1;  
      l1=new JLabel("First Label.");  
      l1.setBounds(25, 25, 1500, 25);   
      l1.setFont(new Font("Monaco", Font.PLAIN, 25));
      f.add(l1);    
      f.setLayout(null);  
      f.setVisible(true);   
   }
   
   //answers to questions will appear on buttons so when the user clicks on it
   //the screen will clear and move onto the next question
   public static void createButton(JFrame f) {
      JButton b=new JButton("2 hours");  
      b.setBounds(50,100,95,30); 
      f.add(b);   
      f.setLayout(null);  
      f.setVisible(true);    
      b.addActionListener(
         new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
               //clears screen to allow for next question to appear 
               f.getContentPane().removeAll(); 
               f.repaint();              
               //f.validate();  
            }  
         });  
      
   } 
        
}

