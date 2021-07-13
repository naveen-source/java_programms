package Pattern;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter n value: ");
		int n=sc.nextInt();
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(ch+" ");
					ch++;
				}	
			}
			System.out.println();
		}
	}

}
