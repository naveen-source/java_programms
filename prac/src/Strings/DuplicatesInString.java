package Strings;

import java.util.Scanner;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1=sc.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)==-1)
			{
				s2=s2+ch;
			}
			
		}
		
		System.out.println("with duplicates: "+s1);
		System.out.print("without duplicate: "+s2);
	}

}
