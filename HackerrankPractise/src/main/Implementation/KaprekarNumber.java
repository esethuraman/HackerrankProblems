package main.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaprekarNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int min, max, n,right , left, cnt =0;
		long k;
		String kString;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		min = Integer.parseInt(in.readLine());
		max = Integer.parseInt(in.readLine());
		n = min;
		for(int i = n; i <= max; i++){
			k =  (long) Math.pow(n, 2);
			kString = Long.toString(k);
			if(kString.length()!=1){
				
				left = Integer.parseInt(kString.substring(0, kString.length()/2));
				right = Integer.parseInt(kString.substring(kString.length()/2, kString.length()));
				
//				System.out.println("left :"+left + " right :"+right+" KString :"+kString);
				if(left+right == n){
//					System.out.printf("Yes %d is a Kaprekar no", n);
					System.out.print(n+" ");
					cnt++;
				}	
			}
			else if(kString.equals("1")){
				cnt++;
				System.out.print(n+" ");
			}
			n = i+1;
			
		}
		if(cnt == 0){
			System.out.println("INVALID RANGE");
		}
	}

}
