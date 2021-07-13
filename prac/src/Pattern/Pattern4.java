package Pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='a';
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || i+j==n-1)
				{
						System.out.print(ch++ +" ");
				}
				else
					System.out.print("* ");
			}
			if(i==(n/2)-1)
			{
				ch++;
			}
			System.out.println();
		}
		

	}

}
