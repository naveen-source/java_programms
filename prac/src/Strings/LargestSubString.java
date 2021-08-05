package Strings;

import java.util.Scanner;

public class LargestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the String: ");
		String str=sc.nextLine();
		int max=0;
		String st="";
		String []s=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			int temp=s[i].length();
			if(max<temp)
			{
				max=temp;
				st=s[i];
			}
		}
		
		System.out.println("the largest substring is: '"+st+"' and length is: "+max);
	}

}
