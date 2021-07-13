package ArraysPrograms;
import java.util.Scanner;


public class ArrayDouble {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int n=sc.nextInt();
		double a[]=new double[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("---------");
		for(int i=n-1;i>=0;i--)
		{
			
			System.out.println(a[i]);
		}
	}
}
