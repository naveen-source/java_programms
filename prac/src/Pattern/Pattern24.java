package Pattern;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					a++;
				}	
			}
				int l=a-1;
				for(int j=0;j<n;j++)
				{
					if(i>=j)
					{
						System.out.print(l-- +" ");
					}
					else
						System.out.print(" ");
				}
				System.out.println();
				
			}
		
			
		}
}

