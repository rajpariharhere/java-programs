class Alpha
{
	int x=75;
    double y=7.8;
	void play()
	{
		System.out.println("Executing play().....");
	}
	void help()
	{
		System.out.println("Executing help()......");
	}
}

    public class Mainclass5
{
	public static void main(String[] args)
	{
		Alpha ref=new Alpha();
		System.out.println(ref.x);
		System.out.println(ref.y);
		ref.play();
		ref.help();
	}
}