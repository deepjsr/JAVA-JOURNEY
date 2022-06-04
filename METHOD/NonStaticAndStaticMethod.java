//WAP to create one static and one non static method
class NonStaticAndStaticMethod 
{	 void m1()
	{
	System.out.println("NON static method ");
	}
	 static void m2()
	{
	System.out.println("static method ");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main starts....");
		NonStaticMethod d1=new NonStaticMethod();
			d1.m1();
			m2();
		System.out.println("Main Ends....");
		
	}
}
