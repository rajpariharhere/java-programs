class Program2
{
	public static void main(String[] args)
	{
		double accBal=10000.0;
		int amt=20009;
		if(amt<=accBal)
		{
            if(amt%100==0)			
		    {
				System.out.println("WithDrawal Success");//1000
			}
            else
            {
				System.out.println("Invalid Denomiation");//2008
			}
			
   		}
			
		     else
			{
				System.out.println("Insifficient Balance"); //20009
	        }	
			 
	}
}