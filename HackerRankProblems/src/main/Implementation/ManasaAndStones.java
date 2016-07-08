package main.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ManasaAndStones {
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
			int t,n, a, b, possibilities;
			String binary;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter test case nos :");
			t = Integer.parseInt(in.readLine());
			int cnt = 0;
			for(int k = 0; k < t; k++){
				System.out.println("Enter n value :");
				n = Integer.parseInt(in.readLine());
				System.out.println("Enter a value :");
				a = Integer.parseInt(in.readLine());
				System.out.println("Enter b value :");
				b = Integer.parseInt(in.readLine());
				
				
				possibilities = (int) Math.pow(2, n-1);
				
				TreeSet<Integer> resultSet = new TreeSet<Integer>();
				
				int stoneVal = 0;
				for(int i = 0; i < possibilities; i++){
					binary = getBinaryVal(i);
//					BigInteger bi = new BigInteger(binary);
					
//					fmt for defining the zero padding
					String fmt = "%0"+n+"d";
					binary = String.format(fmt, new BigInteger(binary));
//					binary = String.format(fmt, Long.parseLong(binary));
//					binary = String.format(fmt, Integer.parseInt(binary));
//					System.out.print(binary+" ");
					stoneVal = 0;
					for(int j = 0; j < n; j++){
						if(j==0){
							continue;
						}
						char tmp = binary.charAt(j);
						if(tmp == '0'){
							stoneVal = stoneVal+a;
						}
						else{
							stoneVal = stoneVal+b;
						}
//						System.out.println("Stone Val : "+stoneVal);
					}
					resultSet.add(stoneVal);
					System.out.println(stoneVal+ " "+ ++cnt);
			
				
				}
//				System.out.println(resultSet);
				Iterator iterator = resultSet.iterator();
				while(iterator.hasNext()){
					System.out.print(iterator.next()+" ");
				}
				System.out.println();
			}
			
		
		
	}
		private static String getBinaryVal(int n) {
//			String binary = Integer.toBinaryString(n);
//			BigInteger bi = new BigInteger(n);
			String binary = Long.toBinaryString(n);
			return binary;
		}
		
}
