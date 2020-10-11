package practise;

import java.util.Scanner;

public class Number_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number to be converted to binary ");
int b = sc.nextInt();
int a[]= new int[10];
int i=0,j,k=0;


while(b>0)
{
	
	 j= b/2;    //5 2 1
	k = b%2;   // 0 1 0 1
	a[i] =k;  // 0 1 0
	i++;
	b=j;
	
}


while(i>0)
 {
	 i--;
	System.out.print(a[i]);
	
 }


}

}
