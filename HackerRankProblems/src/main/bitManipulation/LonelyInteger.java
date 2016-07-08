package bitManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {
	  private static int lonelyInteger(int[] a) {
		  	List<Integer> lonelyList = new ArrayList<>();
		  	
		  		for(int element : a){
		  			try{
		  				if(lonelyList.contains(element)){
				  			lonelyList.remove((Object) element);
				  		}
				  		else{
				  			lonelyList.add(element);
				  			
				  		}
		  			}
		  			catch(Exception e){
				  		System.out.println("Exception caught :" +e.getMessage());
				  		System.out.println(e.getCause());
				  		
				  	}
			  		
			  	}
		  		
		  	return lonelyList.get(0);
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = in.nextInt();
	        }
	        System.out.println(lonelyInteger(a));
	    }
}
