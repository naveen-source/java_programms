package ArraysPrograms;

import java.util.Scanner;

public class SelectionSort {

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
		
		for(int i=0;i<n-1;i++)
		{
			int pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[pos]>a[j])
					pos=j;
			}
			
			if(pos!=i)
			{
				int temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
		}
		System.out.println("After Sorting");
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]+" ");
		}
	}

}
