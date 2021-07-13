package ArraysPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range of an array: ");
		int n=sc.nextInt();
		System.out.println("enter array elements: ");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("--------------------");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
