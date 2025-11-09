class Program4
{
	public static void main(String[] args)
	{
		int num=10;
		int a=2;
		int b=num/2;
		while(a<=b)
		{
			if(num%a==0)
			{
				System.out.println(a);
			}
			a++;
		}
	}
}