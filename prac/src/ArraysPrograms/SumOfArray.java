package ArraysPrograms;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("range of an  array: ");
		int n=sc.nextInt();
		int sum=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		
		System.out.println("sum of array is : "+sum);
	}

}
