import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class TreeMapExample {
	
	public  TreeMap<String,Integer> treeMap = new TreeMap<String,Integer> ();
	public int value = 1;
	public String fileName = "Input.txt";
	String line;
	
	
	public TreeMapExample( ) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		while((line = br.readLine()) != null) {
			this.treeMap.put(line, value);
			value++;
		}
		for(String s : treeMap.keySet()) {
			System.out.println(s + ": " + treeMap.get(s));
		}	
	}
	
	public TreeMap<String,Integer> getTreeMap() {
		return treeMap;
	}

}
