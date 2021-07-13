package ArraysPrograms;


public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,6,8,9,13,16};
		
		int max=a[0];
		int maxOdd=a[0];
		int j=0;
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
		}
		System.out.println("large number is :"+max);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				b[j]=a[i];
				maxOdd=b[j];
			}
		}
		System.out.println("largest odd number is : "+maxOdd);
	}
}