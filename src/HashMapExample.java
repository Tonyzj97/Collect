import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExample {
	
	public HashMap<String,Integer> hashMap = new HashMap<String,Integer> ();
	public int value = 1;
	public String fileName = "Input.txt";
	String line;
	
	
	public HashMapExample( ) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		while((line = br.readLine()) != null) {
			hashMap.put(line, value);
			value++;
		}
		for(String s : hashMap.keySet()) {
			System.out.println(s + ": " + hashMap.get(s));
		}
		
	}

}
