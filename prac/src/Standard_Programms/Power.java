package Standard_Programms;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter integer: ");
		int n=sc.nextInt();
		System.out.println();
		System.out.print("Enter Power: ");
		int pow=sc.nextInt();
		int val=1;
		for(int i=1;i<=pow;i++)
		{
			val=val*n;
		}
		System.out.println(val);
	}

}
