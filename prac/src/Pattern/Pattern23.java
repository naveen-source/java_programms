package Pattern;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter n value: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			char ch='a';
			int a=1;
			
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					if(i%2==0)
					{
						System.out.print(a+" ");
						a++;
					}
					else
					{
						System.out.print(ch+" ");
						ch++;
					}
				}	
			}
			System.out.println();
		}
	}

}
