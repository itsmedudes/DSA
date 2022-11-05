package com.masai.Input;

import java.util.*;


public class MultipleArrayTestCase {


	    public static void main (String[] args){
	        Scanner sc = new Scanner(System.in);
	        
	        int tc = sc.nextInt();
	        
	        while(tc-->0){
	            int N = sc.nextInt();
	            int[] arr = new int[N];
	            
	            for(int j=0; j<N; j++){
	                arr[j]= sc.nextInt();
	            }
	            solve(N,arr);
	        }
	        
	    }
	    public static void solve(int n, int[] arr){
	        System.out.println(Arrays.toString(arr));
	        
	        
//	        2
//	        5
//	        1 2 3 4 5
//	        4
//	        1 2 3 4
	    }
	
}
