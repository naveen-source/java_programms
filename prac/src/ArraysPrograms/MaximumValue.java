package ArraysPrograms;
import java.util.Scanner;

public class MaximumValue {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of an array: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		int maximum=a[0];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>maximum)
			{
				maximum=a[i];
			}
		}
		System.out.println("maximum number is :"+maximum);
	}
}