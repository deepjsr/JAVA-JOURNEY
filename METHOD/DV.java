//WAP to create  all datatype's variable as non Non static
class DV
{	 
    byte by;
	short sh;
	int m;//NSV not initialize
	long lon;
	float fl;
	double dbl;
	char ch;
	boolean bol;
	String str;
	

	public  static void main(String[] args) 
	{
	  DV d=new DV();
		System.out.println("Non Non static byte variable:\n"+d.by);
		System.out.println("Non Non static short variable:\n"+d.sh);
		System.out.println("Non Non static int variable:\n"+d.m);
		System.out.println("Non static long variable:\n"+d.lon);
		System.out.println("Non Non static float variable:\n"+d.fl);
		System.out.println("Non static  double variable:\n"+d.dbl);
		System.out.print("Non static character variable:\n"+d.ch);
		System.out.println("Non static boolean variable:\n"+d.bol);
		System.out.println("Non static String variable:\n"+d.str);

	
	}
}
