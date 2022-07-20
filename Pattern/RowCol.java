//pritn the row and columns

class RowCol 
{
	
	public static void main(String[] args) 
	{
	for (int row=1;row<=5;row++)
	{
		for (int column=1;column<=5;column++)
		{
		  if (row>=column && row+column>=6)
		  {
			  System.out.print(column+" ");
		  }
		  
		}
		System.out.println();
	 }
	}
}
