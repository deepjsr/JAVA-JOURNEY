/*WAP to print the following pattern
*****
 ****
  ***
   **
    *
*/
class Pattern3
{
	public static void main(String[] args) 
	{
	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=5;j++)
		{
		  if (i<=j)
		  {
		  System.out.print("*");
		  }
		  else {
		  System.out.print(" ");
		  }
		}
		System.out.println();
	 }
	}
}