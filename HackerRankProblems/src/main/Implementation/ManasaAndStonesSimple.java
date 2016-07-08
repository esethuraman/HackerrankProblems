package main.Implementation;

import java.io.BufferedReader;
import java.io.FileFilter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManasaAndStonesSimple {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t, n, a, b;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("Enter test case nos :");
		t = Integer.parseInt(in.readLine());
		for(int k =0;k<t;k++){
			n = Integer.parseInt(in.readLine());
			a = Integer.parseInt(in.readLine());
			b = Integer.parseInt(in.readLine());
			
			int diff = 0;
			int min;
			if(a>b){
				min = b;
				diff = a-b;
			}
				
			else {
				min = a;
				diff = b-a;
			}
			
			int firstVal = getfirst(n, min);
			System.out.print(firstVal+" ");
			if(diff!=0){
				for(int i = 0; i < n-1; i++){
					firstVal = firstVal + diff;
					System.out.print(firstVal+" ");
				}
			}
			System.out.println();
		}
		
		

	}
	
	private static int getfirst(int n, int min){
		min = min*(n-1);
		return min;
	}

}
