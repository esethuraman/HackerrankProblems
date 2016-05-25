package main.Implementation;

import java.util.Scanner;

public class CavityMap {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter n value");
        int n = in.nextInt();
        String grid[] = new String[n];
        
        for(int grid_i=0; grid_i < n; grid_i++){
//        	System.out.println("Enter the string ");
            grid[grid_i] = in.next();
            char[] current = grid[grid_i].toCharArray();
            for(int i = 1; i < (current.length-1); i++){
            	if(current[i]>current[i-1] && current[i]>current[i+1]){
            		current[i]='X';
            	}
            }
            
            grid[grid_i] = String.valueOf(current);
//            System.out.println("Converted :"+ grid[grid_i]);
            		
        }
        
//        System.out.println("Output Matrix :");
        for(int grid_i=0; grid_i < n; grid_i++){
        	System.out.println(grid[grid_i]);
        }
	}
}
