package hotel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HotelManagementSystem extends JFrame implements ActionListener
{
    // coding for frame will be in a constructor
    HotelManagementSystem()
    {
        // set bounds .. arg 1&2-location arg 3&4- size(len and breath)
        setBounds(300,200,1366,565);  // as per size of pic
        
        // add image to project using object of a class called ImageIcon
        // classloader class to get image from your system
        // method - getSystemResource - put address of image in brackets
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
       
        // cannot put icon directly on frame therefore we put it in a label
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1366,565); // dist from yaxis , dist from xaxis,len,breath
        add(l1);
        
        JLabel l2 = new JLabel("Hotel Management System");
        l2.setBounds(20,430,1000,90);        
        l2.setForeground(Color.WHITE); // method to change color
        l2.setFont(new Font("serif",Font.PLAIN,70)); // method to change font..create obj of font class
        l1.add(l2); // add label on image
        
        // BUTTON NEXT
        JButton b1 = new JButton("NEXT");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1150,450 ,150 ,50 );
        
        b1.addActionListener(this);
        
        l1.add(b1);
        
        // not giving any layout. by default - border...will place components as per wish
        setLayout(null); 
        
        // by defaut frames are setVisible false(there but cannot be seen)..so change that
        setVisible(true);  // should always be on the last line
        
        // dipper -  multisliding
        // infinite loop
        while(true){
                    l2.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //takes arg in milisec 1000 = 1 second
                    }catch(Exception e){} 
                        l2.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
    }

    public void actionPerformed(ActionEvent ae) // object of actionevent class
    {                                           // constructor called
        new Login().setVisible(true);
        this.setVisible(false); // close welcome frame...this-current class reference
    }
    
    public static void main(String[] args) 
    {
        // constructor call....object
        new HotelManagementSystem();
    }
    
}
