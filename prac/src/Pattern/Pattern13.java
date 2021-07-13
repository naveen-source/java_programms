package Pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(a+" ");
					a++;
				}
				
			}
			System.out.println();
		}
	}

}
