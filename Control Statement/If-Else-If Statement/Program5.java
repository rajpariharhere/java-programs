class Program5
{
	public static void main(String[] args)
	{
		double p =2;
	
		
		if(p>=75 && p<=100)
		{
			System.out.println("Distinction");
		}
		else if(p>=50 && p<75)
		{
			System.out.println("First Class");
		}
		else if(p>=40 && p<50)
		{
			System.out.println("Second Class");
		}
		else if(p>=35 && p<40)
		{
			System.out.println("Pass Class");
		}
		else if(p>=0 && p<35)
		{
			System.out.println("Fall Class");
		}
		else 
		{
			System.out.println("Result Not Found");
		}	
	    
	}
		
}
