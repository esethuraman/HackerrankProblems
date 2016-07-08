package main.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaumAndBday {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter no of testcases : ");
		int testCases = Integer.parseInt(in.readLine());

		for(int i = 0; i < testCases; i++){
//			System.out.println("Enter no of Black and white gifts : ");
			String nos = in.readLine();
			
			long B = Integer.parseInt(nos.split(" ")[0]);
			long W = Integer.parseInt(nos.split(" ")[1]);
			
			System.out.println(B +" : "+W);
//			System.out.println("Enter X Y Z costs : ");
			String costs = in.readLine();
			
			long X = Integer.parseInt(costs.split(" ")[0]);
			long Y = Integer.parseInt(costs.split(" ")[1]);
			long Z = Integer.parseInt(costs.split(" ")[2]);
			
			if( Z >= X && Z >= Y){
//				do nothing
			}
			else if( (Y+Z) < X){
				X = Y + Z;
			}
			else if ((X+Z) < Y){
				Y = X + Z;
			}
			
			long cost = (B*X) + (W*Y);
			System.out.println( cost);
		}
	}

}
