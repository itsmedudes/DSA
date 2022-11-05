package com.masai.Input;

import java.util.*;

public class SquareMatrixWithMultipleTestCase {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int tc = sc.nextInt();
			while(tc-->0){
			int n = sc.nextInt();
			
			int[][] matrix = new int[n][n];

				
				for (int i = 0; i < n; i++)
	                for (int j = 0; j < n; j++)
	                    matrix[i][j] = sc.nextInt();
				

			solve(n,matrix);
			
			}	

		}
		
		public static void solve(int n, int[][] matrix) {
			

			for (int i = 0; i < n; i++){
	            for (int j = 0; j < n; j++)
	                System.out.print(matrix[i][j] + " ");
	                System.out.println();
	            }
			
			
//			2
//			3
//			1 2 3
//			4 5 6
//			7 8 9
//			2
//			1 2
//			3 4
			
		}
			
}
