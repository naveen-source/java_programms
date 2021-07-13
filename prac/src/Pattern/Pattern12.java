package Pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			char ch='A';
			int a=1;
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==2)
				{
				
				System.out.print(ch++ +" ");
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
