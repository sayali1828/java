class Laptop 
{
	String company;
	static int a=34;
	double prize;
	static
	{
	  int a=34;
	  System.out.println(Laptop.a);
	}
	public static void add()
	{
      int num1=34;
	  int num2=22;
	  int res=num1+num2;
	  System.out.println(res);
	}
	static int b;
	{
      System.out.println("Hello from first multiline static intializer");
	}
	String color="Grey";
	static boolean c=false; 

	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		Bag a1=new Bag();
		System.out.println(a1.color);

		Laptop l1=new Laptop();
		System.out.println(l1.company);
		System.out.println(l1.prize);
		System.out.println(l1.color);
		l1.prize=45000;
		l1.company="HP";

		Laptop l2=new Laptop();
		System.out.println(l2.color);
		l2.company="DELL";
		l2.tocode();
		a1.company="SkyBags";
		System.out.println(l1.company);

		Laptop l3=new Laptop();
		l3.company="LENOVO";
		l3.color="BLACK";
		l3.prize=38000;
		System.out.println(l2.company);
		System.out.println(l3.color);
		System.out.println(l3.prize);
		boolean b1=l3.tocode();
		System.out.println(b1);
		System.out.println(l3.company);
		System.out.println(a1.company);
		System.out.println("Main End");

	}
	public boolean tocode()
	{
      System.out.println("Laptop is used to code");
	  return c;
	}
	static
	{
		Laptop.add();
		double t=45.7;
		System.out.println(t);
	}
}
