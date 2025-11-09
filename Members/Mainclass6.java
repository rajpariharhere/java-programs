class Alpha
{
	char p='A';
    boolean q=true;
	void disp()
	{
		System.out.println("Executing disp().....");
	}
	void push()
	{
		System.out.println("Executing push()......");
	}
}

    public class Mainclass6
{
	public static void main(String[] args)
	{
		Alpha ref=new Alpha();
		System.out.println(ref.p);
		System.out.println(ref.q);
		ref.disp();
		ref.push();
	}
}