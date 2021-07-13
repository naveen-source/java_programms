package ArraysPrograms;
import java.util.Scanner;
public class FloatArray {
	 
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the range: ");
			int n=sc.nextInt();
			System.out.println("---------");
			float a[]=new float[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextFloat();
			}
			System.out.println("---------");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
		}
	}


