class SVSM 
{
	static int m=10;
	static void m1()
	{
		//accesing SV from SM
	System.out.println("Accessing static variable:"+m);//accesing SV from SM directly
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts here");
		m1();
		System.out.println("Main ends here");
	}
}
/*We can access the SV directly from the SM*/