package practise;

public class Reverse_string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String val="amma";
		String c = "";
		
		
		/*
		 * for(int i=0;i<val.length();i++) { String je=val.indexOf(i) }
		 */
	int j= val.length();
	for(int i=j-1; i>=0;i--) 
	{
	c= c+Character.toString(val.charAt(i));
	
	}
	System.out.println(c);
	  if(val.equalsIgnoreCase(c))
	  { System.out.println("Palindrome");
	  } 
	  else
	  {
	  System.out.println("Not Palindrome");
	  }
	 
	}
}
