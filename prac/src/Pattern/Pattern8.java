package Pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		for(int i=0;i<n;i++)
		{
		
			for(int j=0;j<n;j++)
			{
				if(a==9)
				{
				
				System.out.print(a +" ");
				a=1;
				
				}
				else
				{
					System.out.print(a++ +" ");
				}
				
			}
			System.out.println();
		}
	}

}
