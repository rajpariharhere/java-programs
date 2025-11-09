class Program3
{
	public static void main(String[] args)
	{
		int p=45;
		if(p%8==0 && p%9==0)
		{
			System.out.println("Madhya Pradesh");
		}
		else if(p%8==0)
		{
			System.out.println("Chhatarpur");
		}
        else if(p%9==0)
        {
			System.out.println("Luvkush Nagar");
		}			
		else
		{
			System.out.println("Raguli");
		}	
		
	}
}