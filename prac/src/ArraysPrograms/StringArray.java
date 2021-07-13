package ArraysPrograms;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int n=sc.nextInt();
		String a[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("---------");
		for(int i=n-1;i>=0;i--)
		{
			
			System.out.println(a[i]);
		}
	}
}
