package Recursion;

public class InfinteNatural {
	public static void Nat(int a)
	{
		System.out.println(a);
		a++;
		
		Nat(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nat(1);
	}

}