package bitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlippingBits {
	
	 public static void main(String[] args)throws Exception{
			long a;
			double binaryVal;
			String zeroPaddedBinaryVal, inverseBinaryVal;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("Enter the number : ");
	        int t = Integer.parseInt(in.readLine());
	        try{
	        	System.out.println("suspect here");
	        	for(int k = 0; k < t; k++){
		            a = (long) Double.parseDouble(in.readLine());
				System.out.println(a);
//				System.out.println(convertDecimalToBinary(a));
				binaryVal = convertDecimalToBinary(a);
				zeroPaddedBinaryVal = padZerostoBinaryValue(binaryVal);
				System.out.println(zeroPaddedBinaryVal);
//				System.out.println(zeroPaddedBinaryVal.length());
				inverseBinaryVal = flipBits(zeroPaddedBinaryVal);
				System.out.println(inverseBinaryVal);
				long result = (long)convertBinaryToDecimal(inverseBinaryVal);
//				double result = convertBinaryToDecimal(String.valueOf(binaryVal));
				System.out.println(result);   
		       }
	        }
	        catch(Exception e){
	        	System.out.println(e.getMessage());
	        	System.out.println(e.getCause());
	        }
			
		}
		
		private static double convertBinaryToDecimal(String inverseBinaryVal) {
			int n = inverseBinaryVal.length()-1;
			int temp;
			double result = 0;
			for(int i = 0; i < inverseBinaryVal.length(); i++){
				temp = Character.getNumericValue(inverseBinaryVal.charAt(i));
				result = (result + temp*Math.pow(2, n));
//				System.out.println(temp + "  ---->  " + result);
				n--;
			}
			return result;
		}

		private static String flipBits(String zeroPaddedBinaryVal) {
			zeroPaddedBinaryVal = zeroPaddedBinaryVal.replace('0', 'X');
			zeroPaddedBinaryVal = zeroPaddedBinaryVal.replace('1', '0');
			zeroPaddedBinaryVal = zeroPaddedBinaryVal.replace('X', '1');
			
			return zeroPaddedBinaryVal;
		}

		private static String padZerostoBinaryValue(double binaryVal) {
			String str = String.valueOf(binaryVal);
			String tempString = " ";
			if(str.length() == 31){
				return (str);
			}
			else{
				int numberOfZeros = 31-str.length()+1;				tempString = "";
				for(int i=0; i<numberOfZeros;i++){
					tempString = tempString.concat("0");
				}
				tempString = tempString.concat(str);
				str = tempString;
			}
			//System.out.println(tempString);
			return (str);
		}

		private static double convertDecimalToBinary(long a){
			long rem;
			double binaryVal=0;
			int itr=0;
			long n=a;
			if(n==1 || n==0){
				return n;
			}
			do{
				rem = n%2;
				binaryVal =  (binaryVal+rem*Math.pow(10, itr));
				itr++;
				n=n/2;
			}while(n!=1);
			binaryVal =  (binaryVal+n*Math.pow(10, itr)); 
			return  binaryVal;
		}
}
