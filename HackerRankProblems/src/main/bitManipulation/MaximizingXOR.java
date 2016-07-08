package bitManipulation;

import java.util.Scanner;

public class MaximizingXOR {
	static int localMaximum = 0;
	static int maxXor(int low, int high) {
		String XORedResult = ""; int max = 0, decimalXORedVal=0;
		for(int first=low; first <= high; first++){
			for(int second=first; second <= high; second++){
				XORedResult=getXOR(first, second);
				decimalXORedVal = getDecimalFromBinary(XORedResult);
				max = getMax(decimalXORedVal);
			}
		}
		return max;
    }
	
	private static int getMax(int decimalXORedVal) {
		if(localMaximum < decimalXORedVal){
			localMaximum = decimalXORedVal;
		}
		return localMaximum;
	}

	private static int getDecimalFromBinary(String xorResult) {
		int decimalVal=0;
//		Zero strip in 16 bit binary value
		long binaryVal = Long.parseLong(xorResult);
		String strippedBinaryVal = String.valueOf(binaryVal);
		int n = strippedBinaryVal.length()-1;
		for(int i=0; i<strippedBinaryVal.length(); i++){
			decimalVal = decimalVal + (int) (Character.getNumericValue(strippedBinaryVal.charAt(0))*Math.pow(2, n--));
			
		}
//		System.out.println("DESI " + decimalVal);
		return decimalVal;
		
	}

	static String getXOR(int first, int second){
		long binaryFirst = getBinaryFromDecimal(first);
		long binarySecond = getBinaryFromDecimal(second);
		String zeroPaddedFirstVal = padZeros(binaryFirst);
		String zeroPaddedSecondVal = padZeros(binarySecond);
		
//		System.out.println("Binary values : "+binaryFirst+"***"+binarySecond);
//		System.out.println("Zero Padded  : "+zeroPaddedFirstVal+"***"+zeroPaddedSecondVal);
		String XORResult="";
		for(int i=0; i<16; i++){
			if(zeroPaddedFirstVal.charAt(i)==zeroPaddedSecondVal.charAt(i)){
				XORResult = XORResult.concat("0");
			}
			else{
				XORResult = XORResult.concat("1");
			}
		}
//		System.out.println("XOR result : "+XORResult);
		return XORResult;
	}
	
	static long getBinaryFromDecimal(int decimal){
		long binary=0;
		int rem, itr=0;
		if(decimal==0 || decimal==1){
			return decimal;
		}
		do{
			rem = decimal%2;
			binary = (long) ((long) binary+ rem*Math.pow(10, itr));
			decimal = decimal/2;
			itr++;
		}while(decimal!=1);
		binary = (long) ((long) binary+ decimal*Math.pow(10, itr));
		return binary;
		
	}
	
	static String padZeros(long binaryVal){
		String zeroPaddedVal = "";
		int noOfZeros = 16-String.valueOf(binaryVal).length();
		for(int i=0;i<noOfZeros;i++){
			zeroPaddedVal = zeroPaddedVal.concat("0");
		}
		zeroPaddedVal = zeroPaddedVal.concat(String.valueOf(binaryVal));
		
		return zeroPaddedVal;
		
	}
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }

}
