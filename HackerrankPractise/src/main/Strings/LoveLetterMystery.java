package main.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveLetterMystery {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t, n ;
//		System.out.println("Enter the no of test cases : ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(in.readLine());
		String str;
		for(int k = 0; k < t; k++){
			n  = 0;
//			System.out.println("Enter the string : ");
			str = in.readLine();
			char[] arr = str.toCharArray();
		
			int len = arr.length;
			for(int i = 0; i < len-1; i++){
//				System.out.println(i + " "+len);
				if(arr[i] == arr[len-1-i]){
					continue;
				}
				else if(arr[i] > arr[len-1-i]){
					while(arr[i] != arr[len-1-i]){
						arr[i] = (char) (arr[i]-1);
						n++;
					}
				}
				else{
					while(arr[i] != arr[len-1-i]){
						arr[len-1-i] = (char) (arr[len-1-i]-1);
						n++;
					}
				}
				
			
			}
			System.out.println(n);
			
		}

	}

}
