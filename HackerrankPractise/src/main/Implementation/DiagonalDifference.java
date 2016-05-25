package main.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiagonalDifference {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int rDiagnal = 0, lDiagonal = 0;
		System.out.println("Enter n value :\n");
		n = Integer.parseInt(in.readLine());
		int matrix[][] = new int[n][n];
		
		System.out.println("Enter the matrix values :\n");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = Integer.parseInt(in.readLine());
				if(i == j){
					rDiagnal = rDiagnal + matrix[i][j];
				}
			}
		}
		
		int min = 0,max=n-1;
		while(min <= n-1 && max >= 0){
			lDiagonal = lDiagonal+matrix[min][max];
			min = min+1;
			max = max-1;
		}
		int result = rDiagnal-lDiagonal;
		System.out.println("The result :");
		if(result >= 0){
			System.out.println(result);
		}
		else 
			System.out.println(-(result));
	}
}
