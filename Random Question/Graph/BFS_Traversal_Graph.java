import java.util.*;
class Main{
	//BFS Traversal in Graph 
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
		
		Main.BFS(V,list);

	}
	
	//this would help us to create a Adajcency List
	public static void addEdges(int i,int j, ArrayList<ArrayList<Integer>> list) {
			list.get(i).add(j);
			list.get(j).add(i);
		
		return;
	}
	
	// Traversing the Graph
	public static void BFS(int V, ArrayList<ArrayList<Integer>> list ) {
		List<Integer> bfsAns = new ArrayList<>();
		boolean visited[] = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			Integer node = queue.poll();
			bfsAns.add(node);
				
				for(Integer it : list.get(node)) {
					if(!visited[it]) {
						visited[it]=true;
						queue.add(it);
					}
				}
		}
		
		System.out.println(bfsAns);
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
		
		
		5 6
		0 1
		3 2
		2 4
		1 4
		3 1
		2 0
	 
	 */
	 
}