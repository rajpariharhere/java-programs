class Program6
{
	public static void main(String[] args)
	{
		int num=15;
		int a=1;
		int sum=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum = sum+a;
			}
			a++;
		}
		if (sum==sum)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
		{
			System.out.println(num+" is not a Perfect Number");
		}
		
	}
}