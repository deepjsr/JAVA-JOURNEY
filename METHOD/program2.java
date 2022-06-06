// Accessing Non static variable from non staic method
class program2

{
	int x;
	static int y;
	void m1()
	{
	//accessing the NSV from NSM directly
	System.out.println("Value in x:"+x);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//Creating multiple method and calling same method
		program1 d1=new program1();
		program2 d2=new program2();
		program2 d3=new program2();
		d1.m1();
		d2.m1();
		d3.m1();
	}
}
/* Whenever the object is created all  the non static members are loded 
inside the object,if non static variables aren't initialized default value
will be initialized to these non static varables by the compiler*/