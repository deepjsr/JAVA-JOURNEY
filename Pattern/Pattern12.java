/*WAP to write following pattern
	123*5
	123*5
	123*5
	123*5
	123*5

*/
class Pattern12 
{
	public static void main(String[] args) 
	{for (int row=1;row<=6;row++)
		{
			for (int column=1;column<=5;column++)
			{
					if (column==4)
					{
					System.out.print("* ");
					}
					else
					{
					System.out.print(column+" ");
					}	
				}
			System.out.println();
		}
	}
}
