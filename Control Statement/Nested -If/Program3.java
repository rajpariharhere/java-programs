class Program3
{
	public static void main(String[] args)
	{
		char gender='F';
		int age=25;
		if (gender=='M')
		{
			if (age>=22)
			{
				System.out.println("Eligible Bachelor");
			}
			else
			{
				System.out.println("Boy Underage");
			}
		}
		else if(gender=='F')
		{
			if(age>=18)
			{
				System.out.println("Eligible Spinster");
			}
			else
			{
				System.out.println("Girl Underage");
			}
		}
			else
		    {
				System.out.println("Invalid Gender");
		    }	
		
	}	
}   