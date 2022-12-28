import java.util.*;
class Main{
	// Graph_Implementaion_Adajcency_List
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vertices");
		int V = sc.nextInt();
		System.out.println("Enter Your Edges");
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
		System.out.println(list);
		Main.printGraph(list);
		
	}
	
	public static void addEdges(int i,int j, ArrayList<ArrayList<Integer>> list) {
		list.get(i).add(j);
		list.get(j).add(i);
		return;
	}
	
	public static void printGraph( ArrayList<ArrayList<Integer>> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print("Node "+i);
			for(int j=0;j<list.get(i).size();j++) 
				System.out.print(" ->"+ list.get(i).get(j));
			
			System.out.println();
		}
	}
	
	
}