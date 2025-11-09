class Example10{
	public static void main(String[] args){
		int a =0, b = 12;
		b = a++ + b++ - a++ - ++b;
		//0 + 12 - 1 - 14 = -3
		//a = 2, b = -3
		System.out.println(a);
		System.out.println(b);
		a = b-- + --b - b++ + --a;
		//-3 + -5 - -5 + 1 = -12
		// b = -4 , a = 
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}