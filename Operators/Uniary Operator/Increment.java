class Increment
{
	public static void main(String[] args)
	{
		int x=20;
		int y=19;
		int z=31;
		
		x=x++ + ++y + z++;
		//20+20+31 = 71
        y=y++ + ++y + ++z;
		//20+22+33 = 75
		z=z++ + ++z + x++;
		//33+35+71= 139
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	
	}
}