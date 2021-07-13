package ArraysPrograms;
import java.util.Scanner;
import java.util.Arrays;
public class MiddleValue {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n=sc.nextInt();
		System.out.println("Enter any elements: ");
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int middle=a[n/2];
		System.out.println("Middle value is :"+middle);
	}
}
