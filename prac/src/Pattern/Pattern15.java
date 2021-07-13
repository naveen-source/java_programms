package Pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=1;
		char ch='z';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				{
					if(j%2==0)
					{
						if(a==9)
						{
							
							System.out.print(a+" ");
							a=1;
						}
						else 
						{
						System.out.print(a+" ");
						a++;
						}
					}
					else
					{
						System.out.print(ch+" ");
						ch--;
					}
				}
			System.out.println();
		}
	}

}
