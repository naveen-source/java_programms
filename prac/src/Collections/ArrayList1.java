package Collections;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(30);
		
		for(int i:al)
			System.out.print(i+" ");
		System.out.println();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(10));
		
		al.remove(3);
		System.out.println(al);
		al.remove(new Integer(10));
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
	}

}
