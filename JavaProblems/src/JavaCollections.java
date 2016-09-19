import java.util.*;
import java.util.Map.Entry;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> empDetails = new HashMap<String,Integer>();
		
		empDetails.put("Ajay", 6);
		empDetails.put("Rahul", 3);
		empDetails.put("Vicky", 7);
		empDetails.put("Suresh", 5);
		empDetails.put("Praveen", 10);
		
		String maxkey = checkMax(empDetails);
		
		Set<Entry<String, Integer>> set = empDetails.entrySet();
		Iterator i = set.iterator();
		i = set.iterator();
		Map.Entry<String, Integer> e;
		
		while(i.hasNext()){
			e = (Entry<String, Integer>) i.next();
			System.out.println("Employee name: " + e.getKey() + " || Employee Experience: " + e.getValue());
		}
		
		System.out.println("Employee with maximum experience: " + maxkey + " having experience: " + empDetails.get(maxkey));
		
	}
	
	public static String checkMax(HashMap<String, Integer> empDetails){
		Set<Entry<String, Integer>> set = empDetails.entrySet();
		Iterator i = set.iterator();
		
		Map.Entry<String, Integer> e = (Entry<String, Integer>) i.next();
		int max = e.getValue();
		String maxkey = e.getKey();
		
		while(i.hasNext()){
			e = (Entry<String, Integer>) i.next();
			if(e.getValue() > max){
				max = e.getValue();
				maxkey = e.getKey();
			}
		}
		
		return maxkey;
	}

}
