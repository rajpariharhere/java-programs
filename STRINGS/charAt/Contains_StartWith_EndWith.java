class Contains_StartWith_EndWith
{
	public static void main(String[] args)
	{
		String str="Engineering";
		
		System.out.println(str.contains("job"));
		System.out.println(str.contains("Eng"));
		
		System.out.println(str.startsWith("engi"));
		System.out.println(str.startsWith("Eng"));
		
		System.out.println(str.endsWith("r ing"));
		System.out.println(str.endsWith("ring"));
	}
}