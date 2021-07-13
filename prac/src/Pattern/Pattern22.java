package Pattern;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter n value: ");
		int n=sc.nextInt();
		char ch='a';
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					if(i%2==0)
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
			}
			System.out.println();
		}
	}

}
