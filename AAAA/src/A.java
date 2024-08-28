import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class A {
    public static void main(String[] args) {

    	   JFrame jFrame = new JFrame();

    	    JDialog jd = new JDialog(jFrame);

    	    
    	    
    	    
    	    
    	    jd.setLayout(new FlowLayout());

    	    jd.setBounds(500, 300, 400, 300);

    	    JLabel jLabel = new JLabel("Press close button to close the dialog.");
    	    JButton jButton = new JButton("Close");
    	    
    	    jButton.addActionListener(new ActionListener() {
    	      @Override
    	      public void actionPerformed(ActionEvent e) {
    	    	  
    	    	    JOptionPane.showMessageDialog(jFrame, "Hello there! How are you today?");
    	    //----------------------------------------------------------------------------------//	    
    	    	    // String 將其顯示給使用者。
    	    	    
    	    	  String getMessage = JOptionPane.showInputDialog(jFrame, "Enter your message");

    	    	    JOptionPane.showMessageDialog(jFrame, "Your message: " + getMessage);
    	   //----------------------------------------------------------------------------------//	     	    
    	    	    
    	    	  int result = JOptionPane.showConfirmDialog(jFrame, "Press any button to close the dialog.");

    	    	    if (result == 0)
    	    	      System.out.println("You pressed Yes");
    	    	    else if (result == 1)
    	    	      System.out.println("You pressed NO");
    	    	    else
    	    	      System.out.println("You pressed Cancel");
    	    	    
    	        jd.setVisible(false);
    	 	    System.exit(0);
    	      }
    	    });
    	    jd.add(jLabel);
    	    jd.add(jButton);
    	    jd.setVisible(true);
   
	}


}