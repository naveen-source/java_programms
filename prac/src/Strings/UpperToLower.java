package Strings;

import java.util.Scanner;

public class UpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		int a=c;
		if(a>=65 && a<=90)
		{
		System.out.print(a+36);
		}
		else 
			System.out.print(a-26);
		
	}

}
