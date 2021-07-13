package Recursion;

public class Nats {
	public static void test(int a)
	{
		System.out.println(a);
		a--;
		
		if(a==0)
		{
			return;
		}
		test(a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10);
	}

}
