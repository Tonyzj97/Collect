import java.io.IOException;

public class Driver {
	
	public static void main(String [] args) throws IOException {
		
		/**
		 * HashSet does not have a get method which makes retrieving data impossible.
		 * So HashSet is useful for adding and remove elements and printing elements.
		 */
		HashSetExample set = new HashSetExample ();
		System.out.println();
		System.out.println();
		
		/**
		 * TreeMap sorts the elements before adding it to the map. The printed map is sorted.
		 */
		TreeMapExample treeMap = new TreeMapExample();
		System.out.println();
		System.out.println();
		
		/**
		 * HashMap doesn't order the elements when adding to the hashmap. But provides efficient 
		 * retrieval process
		 */
		HashMapExample hashMap = new HashMapExample();
		
	}

}
