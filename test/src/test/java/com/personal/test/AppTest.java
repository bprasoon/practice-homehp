package com.personal.test;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	static int b=10;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
		
    }
    @Test
    public void ArrayList_localtime()
    {
        int a=5;
        a=b;
        int c=20;
    	System.out.println("First dummy code");
        System.out.println(b*b);
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(java.time.LocalTime.now());
        Assert.assertEquals(a, c);
        ArrayList numbers = new ArrayList();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( n -> System.out.println(n));
      
        
		/*
		 * try { File myObj = new File("filename.doc"); if (myObj.createNewFile()) {
		 * System.out.println("File created: " + myObj.getName()); } else {
		 * System.out.println("File already exists."); FileWriter myWriter = new
		 * FileWriter("filename.doc"); for(Object s:numbers)
		 * myWriter.write(s+System.lineSeparator()); myWriter.close();
		 * System.out.println("Successfully wrote to the file."); Scanner myReader = new
		 * Scanner(myObj); while (myReader.hasNextLine()) { String data =
		 * myReader.nextLine(); System.out.println(data);} } } catch (IOException e) {
		 * System.out.println("An error occurred."); e.printStackTrace(); }
		 */
    }
}
