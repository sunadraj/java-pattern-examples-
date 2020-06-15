class  S
{
	public static void main(String[] args) 
	{	int k=0;
		int z=0;
		for (int i=1;i<=5 ;i++ )
		{   
			if(i==2)
				k=2;
			else if(i==3  | i==5)
				k=0;
			else if(i==4)
				z=-2;
			
			for(int j=1;j<=5;j++)
			{
				if(j>=3-z && j<=5-k) System.out.print("*");
				else System.out.print(" ");

			}
				System.out.println(" ");
		}

	}
}