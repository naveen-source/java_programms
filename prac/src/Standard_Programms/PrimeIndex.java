package Standard_Programms;
import java.util.Scanner;
public class PrimeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter index number of prime: ");
		int n=sc.nextInt();
		int count=0;
		int index=0;
		int m=3;
		for(int i=2;i<m;i++)
		{
			boolean isPrime=true;
			int temp=i;
			for(int j=2;j<temp;j++)
			{
			if(temp%j==0)
			 {
				isPrime=false;
				break;
			 }
			}
			if(isPrime==true)
			{
				count++;
			}
			if(count==n)
			{
				System.out.println("in place of position "+n+" number "+temp+" is present.");
				break;
			}
			m++;
		}
		
		
	}

}
