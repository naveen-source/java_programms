package Pattern;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter n value: ");
		int n=sc.nextInt();
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(a+" ");
					a++;
				}	
			}
			System.out.println();
		}
	}

}
