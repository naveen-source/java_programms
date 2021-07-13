package Pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int a=n;
			for(int j=0;j<n;j++)
			{
				
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
	}

}
