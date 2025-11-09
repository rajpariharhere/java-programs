class Beta
{
	static int i;
	static 
	{
		System.out.println("Executing static Block");
		i=50;
	}
	public static void main(String[] args)
	{
		System.out.println("Program starts");
		System.out.println(Beta.i);
		System.out.println("Program ends");
	}
}