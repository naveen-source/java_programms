package Pattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==1&&j==1)
				{
					System.out.print("$ ");
				}
				else if(i==2&&j==0)
					System.out.print("& ");
				else if(i==3&&j==2)
					System.out.print("# ");
				else
					System.out.print("! ");
			}
			System.out.println();
		}
	}

}
