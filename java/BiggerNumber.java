class BiggerNumber //to find bigger number from given number. 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
        int d=40;
		System.out.println(a>b&&a>c&&a>d ? a:b>c&&b>d ? b:c>d ? c:d);
	}
}
