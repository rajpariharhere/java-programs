class Sample
{
	static int x=45;
	static double y=7.3;
	static void play()
	
	{
		System.out.println("Executing play()......");
	}
	static void help()
	{
		System.out.println("Executing help()......");
	}
}

     public class mainclass2
{	 
		public static void main(String[] args)
		{
			System.out.println(Sample.x);
			System.out.println(Sample.y);
			Sample.play();
			Sample.help();
		}		
}