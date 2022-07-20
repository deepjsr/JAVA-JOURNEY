/* WAP to write following pattern
   1 0 0 0 0
   2 0 0 0 0
   3 0 0 0 0
   4 0 0 0 0
   5 0 0 0 0
   */
class Pattern13 
{
	public static void main(String[] args)
	{
	for (int row=1;row<=5;row++)
		 {
			for (int column=1;column<=5;column++)
	     		{ 
					if (column==1)
					{
					System.out.print(row+" ");
					}
					else
					{
					System.out.print("0 ");
					}
					
			}
			System.out.println();
		}
	}
	
}
