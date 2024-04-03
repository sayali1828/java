class Methods 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		sub();
		sub1(10,5);
		System.out.println("Main End");
	}
	public static void sub()
	{
		int a=50;
		int b=20;
		int res=a-b;
		System.out.println(res);

	}
	public static void sub1(int c,int d)
	{
		int res =c-d;
		System.out.println(res);
	}
}
