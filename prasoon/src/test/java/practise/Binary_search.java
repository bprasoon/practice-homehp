package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sa[] = {"John","Ancy","Bharat","David"};
		
	//Arrays.sort(sa, (s,t) ->s.compareTo(t));
		//Arrays.sort(sa);
		List<String> samp = new ArrayList<String>(Arrays.asList(sa));
		//Arrays.sort(sa, String::compareToIgnoreCase);
		Collections.sort(samp);
		//Collections.reverse(samp);
		Collections.replaceAll(samp, "David", "Cango");
		//Collections.max(samp <extends compare)
		System.out.println(samp);
		
	
		
		

	}

}
