package main.Implementation;

import java.util.Scanner;

public class CutTheSticks {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
//        System.out.println("Enter n :\n");
		int n = in.nextInt();
        int min = 0 ;
        int arr[] = new int[n];
        int len_arr = 0;
   
//        System.out.println("cut the sticks");
        
//	    writing array elements 
        for(int arr_i=0; arr_i < n; arr_i++){
//        	 System.out.println("Enter value \n:");
        	 arr[arr_i] = in.nextInt();      	       
        }
        
        int tmp_arr[] = new int[n];
        tmp_arr = arr;
        len_arr = len(tmp_arr);
       
        
       while(len_arr > 1){
    	   min = min(tmp_arr, n);
    	   len_arr = len(tmp_arr);
    	   if(min == 0 || len_arr==0){
    		   break;
    	   }
    	  
     	  System.out.println(len_arr);
    	 
//    	  System.out.println("MIN :"+min);
    	  for(int j = 0; j < n; j++){
    		 if(arr[j]>0) {
    			tmp_arr[j] = arr[j]-min;  
    		  }
//    		 else if(arr[j]==min)
//    			 tmp_arr[j] = 0;
    		   
    	  }
//    	  System.out.println(tmp_arr[0]+" "+tmp_arr[1]+" "+tmp_arr[2]);
    	  

      }

	}
	
//	find length of array ignoring zero values
	public static int len(int[] arr){
//		System.out.println("Length called  \n");
		int len_cnt = 0;
		for(int i = 0; i < arr.length; i++){
			if((arr[i] <= 0)){
				continue;
			}
			else 
				len_cnt++;
		}
		return len_cnt;
		
	}
	
//	find the local minimum of array
	public static int min(int[] arr, int n){
		
		int min = 10000;
		
		for(int i =0; i <n ; i++){
			if(i == 0 && arr[i]!=0){
				min = arr[0];
			}
			else if(arr[i]!=0){
				 if( arr[i] < min ){
						min = arr[i];
				}
			}
			else
				continue;
		}
		return min;
		
	}

}
