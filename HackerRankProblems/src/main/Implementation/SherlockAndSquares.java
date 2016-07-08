package main.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockAndSquares {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t, i = 0, itr = 0 , cnt =0;
		int[] values = new int[2];
		String n;
//		System.out.println("Enter no of test cases :");

		t = Integer.parseInt(in.readLine());
		for(itr = 0; itr < t; itr++){
			i =0;
//			System.out.println("Enter the string of min and max values :");
			n = in.readLine();
			cnt = 0;
			for(String str : n.split(" ")){
				values[i++] = Integer.parseInt(str);
			}
//			System.out.println(values[0]+" "+values[1]);
			
			//Iterate from min to max to find squares			
			for(i = values[0]; i <= values[1] ; i++){
				System.out.println("i val :"+ i);
				int tmp = i;
				for(int j = 0; j <= tmp/2; j++){
					if(tmp == 1){
						cnt++;
//						System.out.println("square : "+tmp);
						continue;
						
					}
					if(j*j == tmp){
						cnt++;
//						System.out.println("square : "+tmp);
					}
						
				}
			}
			System.out.println(cnt);
		}
	}
		
}
