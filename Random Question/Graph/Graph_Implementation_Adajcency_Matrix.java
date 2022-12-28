import java.util.*;
class Main{
	// Graph_Implementation_Adajcency_Matrix
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vertices");
		int V = sc.nextInt();
		System.out.println("Enter Your Edges");
		int E = sc.nextInt();
		
		int[][] mat = new int[V][V];
		for(int i =0;i<E; i++) {
			//enter the source 
			int x = sc.nextInt();
			//enter the Destination
			int y = sc.nextInt();
			addEdges(x,y,mat);
		}
		
		Main.printGraph(mat);
		
	}
	
	public static void addEdges(int i,int j, int[][] mat) {
		mat[i][j]=1;
		mat[j][i]=1;
		return;
	}
	
	public static void printGraph(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) 
				System.out.print(mat[i][j]+" ");
			
			System.out.println();
		}
	}
}