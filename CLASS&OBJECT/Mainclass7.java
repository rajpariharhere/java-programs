class Actor
{
	void acting()
	{
		System.out.println("Actor is Acting");
	}
}

    public class Mainclass7
	{
		public static void main(String[] args)
		{
			Actor a1=new Actor();
			System.out.println(a1);
			a1.acting();
			System.out.println("__________________");
			Actor a2=null;
			System.out.println(a2);
			a2.acting();
		}
	}