class Delta
{
	int a=50;
	void test()
	{
		System.out.println("Ececuting test()......");
		
	}
}
public class Mainclass4
{
	public static void main(String[] args)
	{
		System.out.println(new Delta().a);
		new Delta().test();
	}
}