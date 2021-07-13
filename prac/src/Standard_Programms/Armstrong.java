package Standard_Programms;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int rem=1;
		int m=n;
		int s=m;
		int count=0;
		int mul=1;
		int res=0;
		while(s>0)
		{
			s=s/10;
			//System.out.println(s);
			count++;
			
		}
		System.out.println(count);
		if(count>2)
		{
		while(n>0)
		{
			rem=n%10;
			System.out.println(rem);
			//System.out.println("=============");
			for(int i=0;i<count;i++)
			{
				
			mul=mul*rem;
			//System.out.println(mul);
			}
			res=res+mul;
			n=n/10;
		}
		System.out.println(res);
		if(m==res)
		{
			System.out.println("armstrong");
		}
		else
			System.out.println("no armstrong");
	}
		else
			System.out.println("enter number greater than 2 digits.");
	}

}
