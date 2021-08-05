package Collections;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(34);
		al.add(64);
		al.add(13);
		al.add(34);
		al.add(98);
		al.add(78);
		System.out.println(al.size());
		Set<Integer> s=new LinkedHashSet<Integer>(al);
		System.out.println(s);
		Collections.sort(al);
		System.out.println(al);
	}


}
