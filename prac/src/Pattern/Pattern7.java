package Pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			char a='e';
			for(int j=0;j<n;j++)
			{
				
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
	}

}
