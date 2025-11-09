class IndexOf_LastIndexOf
{
	public static void main(String[] args)
	{
		String st="Developer";
		System.out.println(st.indexOf('v'));
		System.out.println(st.indexOf('l'));
		System.out.println(st.indexOf('t'));
		
		
		int a=st.indexOf('e');
		int b=st.indexOf('e',a+1);
		int c=st.indexOf('e',b+1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}