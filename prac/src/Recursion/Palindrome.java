package Recursion;

public class Palindrome {

	public static int test(int a,int sum)
	{
		if(a==0) {
			return sum;
		}
		else {
			sum=sum*10+a%10;
			return test(a/10,sum);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		int sum=0;
		if(a==test(a,sum))
			System.out.println(a+" is palindrome");
		else
			System.out.println(a+" is not a palindrome");
	}

}
