package ArraysPrograms;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range: ");
		int n=sc.nextInt();
//		int count=0;
		int[] a=new int[n];
		System.out.print("enter the Values: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int b=a[i];
			boolean isPrime = true;
		for(int j=2;j<=b/2;j++)
		{
			if(b%j==0)
			{
				isPrime=false;
				break;
			}
		}
			if(isPrime)
			{
				System.out.println("prime number in array:: "+n);
			}
		}
		
	}

}
