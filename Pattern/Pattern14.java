/* WAP to print following pattern
	12345
	54321
	12345
	54321

*/
class  Pattern14
{
	
	public static void main(String[] args) 
	{
		/*logic1
		for (int row=1;row<5;row++)
		    {
				int x=1;
				
				for (int column=5;column>=1;column--)
				{
				  if (row%2==0)
				   {
					System.out.print(column);
				    }
				     else
					 {
					   System.out.print(x);
				        x++;
					}
				}
				System.out.println();

		 }*/
		 //logic2
		 for (int row=1;row<5;row++)
		    {
				int x=5;
				
				for (int column=1;column<=5;column++)
				{
				  if (row%2!=0)
				   {
					System.out.print(column);
				    }
				     else
					 {
					   System.out.print(x--);
				        
					}
				}
				System.out.println();

		 }
		
	
	}
}
