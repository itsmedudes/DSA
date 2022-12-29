import java.util.*;
class Main{
	//DFS Traversal in Graph 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Vertices");
		int V = sc.nextInt();
//		System.out.println("Enter Your Edges");
		int E = sc.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int i=0;i<V;i++) {
			list.add(new ArrayList<Integer>());
		}
		for(int i =0;i<E; i++) {
			//enter the source 
			int x = sc.nextInt();
			//enter the Destination
			int y = sc.nextInt();
			addEdges(x,y,list);
		}	
		
	//  System.out.println(list);
		Main.DFS(V, list);

	}
	
	//this would help us to create a Adajcency List
	public static void addEdges(int i,int j, ArrayList<ArrayList<Integer>> list) {
			list.get(i).add(j);
			list.get(j).add(i);
		
		return;
	}
	public static void dfsFunction(int node, ArrayList<ArrayList<Integer>> list,boolean[] visited,List<Integer> ans) {
		
		visited[node]=true;
			ans.add(node);
		 for(Integer it : list.get(node)) {
			 if(!visited[it]) {
				 
				 dfsFunction(it,list,visited,ans);
			 }
		 }
	}
	public static void DFS(int V,ArrayList<ArrayList<Integer>> list) {
		boolean[] visited = new boolean[V+1];
		List<Integer> ans = new ArrayList<>();
		dfsFunction(0,list,visited,ans);
		System.out.println(ans);
	}
	
	

	/*
	  
	Test Case for checking  
	 	3 3
		1 2
		0 1
		1 1
		
		3 6
		0 1
		1 2
		1 1
		1 0
		2 1
		2 0
		
		
		5 4
		0 2
		0 3
		0 1
		2 4
	 
	 */
	 
}