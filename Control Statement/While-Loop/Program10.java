 class Program10
{
	public static void main(String[] args)
	{
		int x=5;
		int y=15;
		int sum=0;
		while(x<=y)
		{
			if(x%2!=0)
			{
				sum=sum+x;
			}
			x++;
		}
		{
			System.out.println(sum);
		}
	}
}   