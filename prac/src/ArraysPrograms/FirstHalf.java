package ArraysPrograms;

import java.util.Scanner;

public class FirstHalf {

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
			
		}
		System.out.println("---------------------------");
		for(int i=0;i<=n/2;i++)
		{
			System.out.println(a[i]);
			
		}
	
		
		
	}

}
