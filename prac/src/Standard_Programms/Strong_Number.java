package Standard_Programms;
import java.util.Scanner;
public class Strong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n=sc.nextInt();
		
		int m=n;
		int r=0;
		int fact=1;
		int sum=0;
		while(n>0)
		{
			r=(n%10);
			for(int i=1;i<=r;i++)
			{
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		System.out.println(sum);
		if(m==sum)
		{
			System.out.println(m+" is strong number");
		}
		else
			System.out.println(m+" is not a strong number");
				
		}
	}
	
	



