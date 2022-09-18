package BasicSwing;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.*;

public class labelMy {
public static void main(String args[]) {
	ImageIcon img=new ImageIcon("my.jpg");
	
	Border border=BorderFactory.createLineBorder(Color.green,5);  //creatinng a border for the label
	JLabel label=new JLabel();       //create a label
	label.setText("Bro, do you even code!");   //set a text of label
	label.setIcon(img);
	label.setHorizontalTextPosition(JLabel.CENTER);//set text left,center,right of imageicon u can also use 
	label.setForeground(Color.green);      //set text color
	label.setFont(new Font("MV Boli",Font.PLAIN,50));   //set font of text (styling ,remember parameters)
	label.setBackground(Color.black );  //set background color & should be used with label.setOpaque(true) to see changes
	label.setOpaque(true);      //display background color - to visibility
	label.setBorder(border);       //using the border in the label
	label.setVerticalAlignment(JLabel.CENTER); //set vertical position of the icon+text within label
	label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of the icon+text within label
	//label.setBounds(0,0,300,250);   //set x,y position within frame as well as dimensions  or instead you can use frame.pack() method
	
	JFrame frame =new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// frame.setSize(500,500);  // to set size of the frame or use frame.pack() method instead at last
	frame.setVisible(true);
	frame.add(label);
	frame.pack();  //this method should be used at last it packs all the labels and frames accordingly and proceeds 
}
}
