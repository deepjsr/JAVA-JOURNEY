/*WAP to write following pattern
	12345
	54321
	12345
	54321
	12345
*/
class Pattern10 
{
	public static void main(String[] args) 
	{
		for (int row=1;row<=5;row++)
		    {
				if (row%2==1)
				{
					for (int val1=1;val1<=5;val1++)
					{

					System.out.print(val1);
					   }	
						 }
						  else
						   {
						for (int val1=5;val1>=1;val1--)
					     {
						System.out.print(val1);
		     			}
		   			}
		               	System.out.println();
				 } 	
              }
		}
