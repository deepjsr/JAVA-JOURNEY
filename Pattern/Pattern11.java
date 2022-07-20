/* WAP to write following pattern
   11111
   00000
   11111
   00000
   11111
   00000
   */
class Pattern11 
{
	public static void main(String[] args) 
	{
		for (int row=1;row<=6;row++)
		{
			for (int column=1;column<=5;column++)
			{
					if (row%2==1)
					{
					System.out.print("1");
					}
					else
					{
					System.out.print(0);
					}	
					
			}
			System.out.println();
		}
	}
 
}
