package Basic;

import java.util.Scanner;

public class String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String data=sc.next();
		String decode="";
		int count=0;
		for(int i=data.length()-1;i>=0;i--)
		{
		 decode=decode+data.charAt(i);
		}
		//System.out.print(decode);
		
		for(int i=0;i<data.length();i++)
		{
			if(data.charAt(i)==decode.charAt(i))
			{
				count++;
			}
		}
		System.out.print(count);
	}

}
