class Utility
{
	char ch;
	{
		System.out.println("Executing non-static block");
		ch='A';
	}
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		Utility obj=new Utility();
		System.out.println(obj.ch);
		System.out.println("Program Ends");
	}
}