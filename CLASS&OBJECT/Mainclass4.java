class Bike
{
	int cc;
	double milage;
	void drive()
	{
		System.out.println("Driviing Bike its CC "+cc);
	}
	void travels()
	{
		System.out.println("Travel in Bike with Milage "+milage);
	}
}
public class Mainclass4
{
	public static void main(String[] args)
	{
		Bike b1=new Bike();
		b1.cc=150;
		b1.milage=45.0;
		b1.drive();
		b1.travels();
		System.out.println("------------------------------------------------------");
		Bike b2=new Bike();
		b2.cc=350;
		b2.milage=25.0;
		b2.drive();
		b2.travels();
	}
}