package ArraysPrograms;

import java.util.Scanner;

public class RaplacingElement {

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
		System.out.println("========before sorting=========");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int r=3;
		System.out.println("you have "+r+" attempts to replace");
		while(r>0)
		{
		System.out.print("enter the array index value from 0 to "+(n-1)+" to 'replace'");
		int x=sc.nextInt();
		System.out.print("enter the value to be replaced: ");
		int y=sc.nextInt();
		
		a[x]=y;
		System.out.println(r-1+" attempts are left");
		System.out.println("press 'y' to continue , press 'n' to stop");
		char c=sc.next().charAt(0);
		if(c=='y'||c=='Y')
		{
			r--;
			break;
		}
		else if(c=='n'||c=='N')
		{
			break;
		}
		else
		{
			System.out.println("invalid input");
			r--;
		}
		}
		System.out.println("========After sorting=========");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
