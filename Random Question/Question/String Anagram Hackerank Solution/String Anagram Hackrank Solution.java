
import java.util.*;

class Main{
	// that the bruteforce solution
	public static void main(String[] args) {
	       List<String> dictionary = Arrays.asList(
	    		   "hack","a","rank","khac","ackh","kran","rankhacker","a","ab","ba","stairs","raits"  
	    		   );
	       

	       List<String> query = Arrays.asList( 
	    		   "a","nark","bs","hack","stair"
	    		   );
	    		   

	       System.out.println(Arrays.toString(solve(dictionary,query)));
	    }

	    public static int[] solve(List<String> dictionary,List<String> query){
	        int ans[] = new int[query.size()];
	      for(int i=0;i<query.size();i++){
	            int count =0;
	    		for(int j=0;j<dictionary.size();j++){
					
	    			if(query.get(i).length()==dictionary.get(j).length()){
	    			    
	    			   if(subStringcheck(query.get(i),dictionary.get(j))==true){
	    			       count++;
	    			   }
	    			    
	    			}
	    		}
	    		ans[i]=count;
	    		
	    	}
	    	return ans;
	    }
		public static boolean subStringcheck(String a,String b){
			int freq[] = new int[26];
			int freq2[] =new int[26];
			for(int i=0;i<a.length();i++){
				freq[a.charAt(i)-'a']++;
				freq2[b.charAt(i)-'a']++;
			}
			for(int i=0;i<freq.length;i++){
				if(freq[i]!=freq2[i]) return false;
			}
			return true;
			
		}
}