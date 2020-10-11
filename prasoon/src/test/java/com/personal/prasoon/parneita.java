package com.personal.prasoon;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class parneita {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
parneita p = new parneita();

// This is to display welcome message
JOptionPane.showMessageDialog(null, "Welcome, Young girl !!");

//this is to take the input from the user
String input= JOptionPane.showInputDialog("Please enter your cute name !!!");

//conditional check for Paru or anybody else
if(input.equalsIgnoreCase("Parneita")||input.equalsIgnoreCase("Paru"))

JOptionPane.showInternalMessageDialog(null, "This angle warrior " + input + " is very cute and energetic !! ");
    
else
	JOptionPane.showInternalMessageDialog(null, "This lady " + input + " is a good teacher !! ");
}


	
	


}
