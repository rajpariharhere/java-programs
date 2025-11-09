class Beta 
{
	int a;
	 double b;
	 char c;
	 Beta()
	 {
		 a=25;
		 b=7.3;
		 c='J';
	 }
}
public class Mainclass4
{
	public static void main (String[] args)
	{
		Beta ref=new Beta();
		System.out.println(ref.a);
		System.out.println(ref.b);
	    System.out.println(ref.c);
		
		
		
	}
}