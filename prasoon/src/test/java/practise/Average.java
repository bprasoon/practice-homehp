package practise;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

public class Average {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner sc= new Scanner(System.in);
		 * System.out.println("Enter the count of the element"); int n= sc.nextInt();
		 * Integer a[] = new Integer[n];
		 * 
		 * for(int i=0;i<n;i++) a[i]= sc.nextInt();
		 */
		
				Integer a[] = {72,3,4,15,6,-7};
				//List<Integer> gra = Arrays.asList(a);
		List<Integer> gra = new ArrayList<Integer>();
		gra = Arrays.asList(a);
		gra.stream().sorted().forEach(ba->System.out.print(" " + ba));
				Collections.sort(gra);
				
				System.out.println(gra);
				//System.out.println("Smallest number in the set is "+ gra.get(0));
				//System.out.println("Largest number in the set is "+ gra.get(n-1));
				System.out.println(InetAddress.getLocalHost());
			
				System.out.println(InetAddress.getByName("www.google.com"));
					
			}

		


	}


