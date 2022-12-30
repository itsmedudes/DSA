import java.util.*;
class Main{
	//DFS Traversal in Disconnect Graph 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i=0;i<V; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<E;i++) {
			int x =sc.nextInt();
			int y = sc.nextInt();
			graphCreated(x,y,graph);
		}
		System.out.println(graph);
		dfs(V,graph);
	}
	
	public static void graphCreated(int i,int j, ArrayList<ArrayList<Integer>> graph) {
		
		graph.get(i).add(j);
		graph.get(j).add(i);
		return;		
	}
	
	public static void dfs(int V, ArrayList<ArrayList<Integer>> graph) {
		boolean visited[]  = new boolean[V];
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<V;i++) {
			if(visited[i]==false) {	
				dfsTraversal(i,visited,ans,graph);			
			}
		}
		System.out.println(ans);
	}
	public static void dfsTraversal(int node,boolean[] visited, ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> graph) {
		visited[node]=true;
		ans.add(node);
			
		for(Integer it : graph.get(node)) {
			if(visited[it]==false) {
				dfsTraversal(it,visited,ans,graph);
			}
		}
	}
	
	/*
	
	  
	// Time Complexity = O(V+E)
	 	Space Complexity = O(V)
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