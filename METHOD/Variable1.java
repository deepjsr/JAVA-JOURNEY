//User defined method & # diffrent ways to access it
class Variable1
{
	// user defined method 
	public static void m1()  //declartion of m1 method (UDT method)
	{
		int x=10; //declared and initialized LV named as 'x' with value 10
		//accessing LV inside m1 method -->NOERROR 
		System.out.println("LV 'x' inside ml has value:"+x);
    }
	public static void m2()
	{
		 // error:Accessing LV of m1() inside m2()
		//System.out.println("Accessing LV of ml inside m2 method which has value:"+x);
	}
	public static void main(String[]args)
	{
	System.out.println("main starts ...");
	m1();// called the SM directly --->recommended bcz calling from same class
	Variable1.m1();// called the SM using Class Name
	new Variable1().m1();//using object reference
	System.out.println("main ends");
    }
}