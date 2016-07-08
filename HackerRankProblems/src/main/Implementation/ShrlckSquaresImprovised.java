package main.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShrlckSquaresImprovised {
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		int t, i, cnt = 0;
		int[] values = new int[2];
		String n;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(in.readLine());
		for(int itr = 0; itr < t; itr++){
			n = in.readLine();
			i = 0;
			cnt = 0;
			for(String str : n.split(" ")){	
				values[i++] = Integer.parseInt(str);
			}
			
			int min = values[0], max = values[1];
			int minRoot = 0;
			minRoot = (int) Math.pow(min, 0.5);
			
			if((computeSquare(minRoot) < min) && (computeSquare(minRoot+1) <= max)){
				min = computeSquare(minRoot+1);
				++minRoot;
				cnt++;
			}
			else if((computeSquare(minRoot) == min) ){
				cnt++;
			}
		
			while(computeSquare(++minRoot) <= max){
				++cnt;
				
			}

			System.out.println(cnt);
		}
	}
	
	private static int computeSquare(int n){
		return (int) Math.pow(n, 2);
	}
}
