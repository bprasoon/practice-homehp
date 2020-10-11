package practise;

public class Sum_of_int {
	
	public static void main(String[] s) 
	{
		int r= 123456789;
		int j=0;
		while(r>0)
		{
		int k=r/10;
		int y= r%10;
		j= j+y;
		r=k;
		}
		System.out.println(j);
	}

}
