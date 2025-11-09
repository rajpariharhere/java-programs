class Helper
{
	double val;
	{
		val=2.3;
	}
	{
		val=4.5;
	}
	{
		val=8.5;
	}
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		Helper obj=new Helper();
		System.out.println(obj.val);
		System.out.println(obj.val);
		System.out.println(obj.val);
		System.out.println("Program Ends");
	}
}