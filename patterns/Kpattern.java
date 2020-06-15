class  K
{
	public static void main(String[] args) 
	{	int k=5;
		for (int i=1;i<=5 ;i++ )
		{   
			if(i<=3)
				k--;
				else 
				k++;
			
			for(int j=1;j<=5;j++)
			{
				if(j==2 | j==k) System.out.print("*");
				else System.out.print(" ");

			}
				System.out.println(" ");
		}

	}
}