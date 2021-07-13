package forloop;
import java.util.Scanner;
public class HorAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for(char i='A',j='a';i<='Z'&&j<='z';i++,j++)
		{
			System.out.print(i+" ");
			
			System.out.print(j+" ");
		}
		
	}

}
