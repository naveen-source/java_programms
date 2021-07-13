package Basic;
import java.util.Scanner;
public class PrintDay {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number b/w 1-7");
	int n=sc.nextInt();
	if(n>=1&&n<=7)
		switch(n)
		{
		case 1:System.out.println("monday");break;
		case 2:System.out.println("tuesday");break;
		case 3:System.out.println("wednesday");break;
		case 4:System.out.println("thursday");break;
		case 5:System.out.println("friday");break;
		case 6:System.out.println("saturday");break;
		case 7:System.out.println("sunday");break;
		}
	else
		throw new InvalidInputException();
}
}
