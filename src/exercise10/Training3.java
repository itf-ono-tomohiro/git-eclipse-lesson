package exercise10;

import java.util.HashSet;

public class Training3 {

	public static void main(String[] args) {
		String[] array = {"A", "B", "C"};
		
		HashSet<String> Set = new HashSet<>();
		Set.add(array[0]);
		Set.add(array[1]);
		Set.add(array[2]);
		Set.add(array[0]);
		
		System.out.println(Set.size());
		for(String s : Set ) {
			System.out.println(s);
		}
		
	}

}
