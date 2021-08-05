package Strings;

import java.util.Scanner;

public class CompareChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//String str1=str;
		boolean pre=false;
		System.out.print("enter character: ");
		char c=sc.next().charAt(0);
		
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==c)
			{
				pre=true;
				break;
			}
		}
			if(pre)
			System.out.print(c+" present");
			else
				System.out.print("not present");
	
	}

}
