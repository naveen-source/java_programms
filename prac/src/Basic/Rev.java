package Basic;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B="";
        for(int i=A.length()-1;i>=0;i--)
        {
            B=B+A.charAt(i);
        }
        System.out.println(A);
        System.out.println(B);
        if(A.equals(B))
            System.out.print("Yes");
        else
            System.out.print("No");
        
	}

}
