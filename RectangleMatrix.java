package com.masai.Input;

import java.util.*;

public class RectangleMatrix {
		
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
			
				int n = sc.nextInt();
				int m = sc.nextInt();
			
				int[][] matrix = new int[n][m];
				
	            	for (int i = 0; i < n; i++)
		                for (int j = 0; j < m; j++)
		                    matrix[i][j] = sc.nextInt();
					
				solve(n,m,matrix);

			}
			
			public static void solve(int n,int m, int[][] matrix) {
				

				for (int i = 0; i < n; i++){
		            for (int j = 0; j < m; j++)
		                System.out.print(matrix[i][j] + " ");
		                System.out.println();
		            }
				
//	 			   3 4
//	             1 2 3 4
//	             5 6 7 8
//	             9 10 11 12
			}

}
