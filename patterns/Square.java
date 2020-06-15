import java.util.Scanner;
class Square
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter any number ");
		int n=scn.nextInt();
		for(int i=0; i<n; i++)
			{
			for(int j=0; j<n; j++)
				{
				if(i>=j){
				System.out.print("*");
				System.out.print(" ");
				}
				else
				System.out.print(" ");
				}
				System.out.println();
				        
			}
	 }
}
