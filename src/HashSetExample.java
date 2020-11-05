import java.util.HashSet;

public class HashSetExample {
	
	HashSet<String> set = new HashSet<String>();
	
	public HashSetExample() {
		boolean addResult;
	      boolean removeResult;

	      set.add("A Tale of Two Cities");
	      set.add("The Lord of the Rings");
	      set.add("Le Petit Prince");
	      
	      System.out.println(set.remove("The Lord of the Rings"));

	      addResult = set.add("Le Petit Prince");
	      System.out.println("Added \"Le Petit Prince\" again: " + addResult);
	  
	      removeResult = set.remove("The Hobbit");
	      System.out.println("Removed \"The Hobbit\": " + removeResult);
	      
	      if(set.contains("A Tale of Two Cities")) {
	    	  System.out.println("A Tale of Two Cities");
	      }
	      for(String s : set) {
	    	  System.out.println(s);
	      }
	      
	}
     

     
  


}
