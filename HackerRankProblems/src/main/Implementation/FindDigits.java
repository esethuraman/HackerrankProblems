package main.Implementation;

import java.util.*;

public class FindDigits {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int N = n;
            int cnt = 0 ;
			int tmp = n;

			while(n>0){
				tmp = n%10; 
				if(tmp!=0 && N%tmp == 0 ){
					cnt++;
				}
				n = n/10;
			}
			System.out.println(cnt);
		}
	}
}
