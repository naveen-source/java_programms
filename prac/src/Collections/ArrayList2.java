package Collections;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("mango");
		al.add("apple");
		al.add("banana");
		al.add("grapes");
		al.add("orange");
		al.add("watermelon");
		
		al.set(3,"cherry");
		System.out.println(al);
		System.out.println(al.size());
	}

}
