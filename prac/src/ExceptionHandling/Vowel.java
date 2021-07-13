package ExceptionHandling;
import java.util.Scanner;
public class Vowel {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter character");
	char ch=sc.next().charAt(0);
	if(ch>='a'&&ch<='z')
	switch(ch)
	{
	case 'a':System.out.println("given character is vowel");break;
	case 'e':System.out.println("given character is vowel");break;
	case 'i':System.out.println("given character is vowel");break;
	case 'o':System.out.println("given character is vowel");break;
	case 'u':System.out.println("given character is vowel");break;
	default:System.out.println("consonent");break;
	}
	else
		throw new InvalidInputException();
}
}
