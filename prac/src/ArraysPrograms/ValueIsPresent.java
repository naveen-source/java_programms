package ArraysPrograms;

import java.util.Scanner;

public class ValueIsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		boolean present=false;
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the key value: ");
		int val=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(val==a[i])
			{
				present=true;
				count=i;
				break;
			}
			else
				present=false;
		}
		if(present)
			System.out.print("the value present at index: "+count);
		else
			System.out.print("the value you entered not present in the array.");
	}

}
