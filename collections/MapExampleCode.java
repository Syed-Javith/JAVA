import java.util.*;

public class MapExampleCode{
	public static void main(String[] args){
		Map<Character , Integer > map = new HashMap<>();
		System.out.println("to add use put method map.put(key,value) " );
		map.put('a',6);
		map.put('s',9);
		map.put('q',2);
		map.put('w',5);
		System.out.println(map);
		map.remove('w');
		System.out.println("to delete use remove method map.remove(key) " );
		System.out.println(map);
		System.out.println("to iterate the map use keyset in for each as for(<T> key : map.keySet() ) " );
		for(Character key : map.keySet() )
		 System.out.println(key + " " + map.get(key)); 
	}
}