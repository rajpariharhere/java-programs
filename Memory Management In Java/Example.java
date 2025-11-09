class Example
{
	static void test()
	{
		System.out.println("Test Starts");
		System.out.println("Test Ends");
	}
	static void disp()
	{
		System.out.println("Disp Starts");
		Example.test();
		System.out.println("Disp Ends");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		Example.disp();
		System.out.println("Main Ends");
	}
}