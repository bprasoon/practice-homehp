package practise;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	multiply.number();
	System.out.println();
	}

	public static void number()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		 int a= sc.nextInt();
		 int b=a;
		int i=1;
		while(i<11)
		{
			b=a*i;
			System.out.println(a+ " * "+ i+ " = " +b);
			i++;
			
		}
	}
	
}
