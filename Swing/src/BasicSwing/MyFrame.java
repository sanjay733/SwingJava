package BasicSwing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyFrame(){
		
		ImageIcon img1=new ImageIcon("hi.jpg");
		this.setTitle("title goes here");
		this.setSize(420,420);
		this.setVisible(true);
		ImageIcon img=new ImageIcon("hi.jpg");
		this.setIconImage(img.getImage());
		this.getContentPane().setBackground(Color.white);		
	}

}
