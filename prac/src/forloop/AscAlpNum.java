package forloop;

import java.util.Scanner;

public class AscAlpNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=1;
		for(char i='A';i<='Z';i++)
		{
			System.out.print(i+" "+c);
			System.out.println();
			c++;
		}
	}

}
