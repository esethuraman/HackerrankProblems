package main.Implementation;

import java.util.Scanner;

public class FunnyString {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        String str = in.nextLine();
	        String str1 = in.nextLine();
	        int var1,var2;
	        boolean flag = false;
	        if(str.length() == str1.length()){
	            for(int j = 1; j < str.length(); j++){
	                var1 = (int)str.charAt(j) - (int)str.charAt(j-1) ;
	                var2 = (int)str.charAt(j) - (int)str.charAt(j-1) ;
	                if(var1 == var2)
	                    continue;
	                else{
	                    flag = true;
	                    break;
	                }
	            }
	            if(flag == false)
	                System.out.println("Funny");
	            else
	                System.out.println("Not Funny");
	        }
	        else
	        	 System.out.println("Not Funny");
	    }
}
