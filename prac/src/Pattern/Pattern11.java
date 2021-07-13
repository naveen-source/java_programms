package Pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {

				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				char a='i';
				for(int i=0;i<n;i++)
				{
				
					for(int j=0;j<n;j++)
					{
						if(a=='a')
						{System.out.print(a+" ");
							a='i';
						}
						else
						{
							System.out.print(a-- +" ");
						}
						
					}
					System.out.println();
				}
				
			}

		}

