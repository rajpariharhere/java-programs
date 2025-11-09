class Mobile
{
	String model;
	double price;
	void call()
	{
		System.out.println("Call in "+model);
	}
	void message()
	{
		System.out.println("message in "+model+" is price is "+price);
	}
}
public class Mainclass3
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile();
		m1.model="Iphone 17";
		m1.price=1.5;
		m1.call();
		m1.message();
		System.out.println("----------------------------------------------------------------");
		Mobile m2=new Mobile();
		m2.model="S25 Ultra";
		m2.price=1.4;
		m2.call();
		m2.message();
	}
}