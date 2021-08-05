package Strings;

public class BigString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s= {"blue","yellow","pink","red"};
		String biggestElement=s[0];
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].compareTo(biggestElement)>0)
			{
				biggestElement=s[i];
			}
			
		}
		
		System.out.println("Biggest String is: "+biggestElement);
	}

}
