class Program5
{
	public static void main(String[] args)
	{
		int num=10;
		int a=1;
		int sum=0;
		while(a<=num/2)
		{
			if(num%1==0)
			{
				sum=sum+a;
			}
			a++;
		}
		System.out.println("Divisors Sum : "+sum);
	}
}