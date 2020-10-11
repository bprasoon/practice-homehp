package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort_small_large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count of the element");
		int n= sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		 a[i]= sc.nextInt();
		
		int max, min;
		max=min=a[0];
		
		for(int j=0;j<n;j++)
		{
			if(a[j]<min)
			{
			min=a[j];
			}
			if(a[j]>max)
				max=a[j];
			
		
		}
		System.out.println("max is " + max);
		System.out.println("min is " + min);
	
		System.out.println(Arrays.toString(a));
		
			
	}

}
