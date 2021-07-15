package ArraysPrograms;

import java.util.Scanner;

public class GivenElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the value to be searched: ");
		int val=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(val==a[i])
				count++;
		}
		
		System.out.print("the count of value "+val+" is "+count);
	}

}
