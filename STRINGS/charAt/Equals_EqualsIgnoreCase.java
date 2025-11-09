class Equals_EqualsIgnoreCase
{
	public static void main(String[] args)
	{
		String s="j2ee";
		
		System.out.println(s.equals("adc java"));
		System.out.println(s.equals("J2ee"));
		System.out.println(s.equals("j2ee"));
		
		System.out.println(s.equalsIgnoreCase("adv java"));
		System.out.println(s.equalsIgnoreCase("J2EE"));
		System.out.println(s.equalsIgnoreCase("j2ee"));
	}
}