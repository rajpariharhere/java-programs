class Utility
{
	static int a=10;
	int b=20;
	
	
	static void run()
	{
		System.out.println("Executing run()......");
	}
	static void read()
	{
		System.out.println("Executing read()......");
	}
}

     public class Mainclass7
{	 
		public static void main(String[] args)
		{
			Utility obj=new Utility();
			System.out.println(Utility.a);
			System.out.println(obj.b);
			Utility.run();
			obj.read();
		}		
}