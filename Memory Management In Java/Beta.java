class Beta
{
	static int x=10;
	int y=20;
	static void play()
	{
		int z=30;
		System.out.println("Executing play()..................");
	}
	public static void main(String[] args)
	{
		System.out.println("Main starts");
		Beta b=new Beta();
		Beta.play();
		System.out.println("Main ends");
	}
}