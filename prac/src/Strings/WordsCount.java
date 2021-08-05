package Strings;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.nextLine();
		String []s2=s1.split(" ");
	
		System.out.print("the count of String is: "+s2.length);
	}

}