package ArraysPrograms;

import java.util.Scanner;

public class FindingIndex {

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
			System.out.print("enter the number: ");
			int ser=sc.nextInt();
			boolean present =true;
		for(int i=0;i<n;i++)
		{
			if(ser==a[i])
			{
				System.out.print("the index of number is : "+i);
				present=true;
				break;
			}
			
			else 
			{
				present=false;
			}
			
		}
		if(present==false)
			System.out.print("Element is not present in the array ");
	}

}
