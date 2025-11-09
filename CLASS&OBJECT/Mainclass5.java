class Account
{
	long accNum;
	double accBal;
	void withdraw(double amt)
	{
		accBal=accBal-amt;
		System.out.println("Withdraw from "+accNum+" Success");
		System.out.println("Avaiable Balance "+accBal);
	}
	void deposite(double amt)
	{
		accBal=accBal+amt;
		System.out.println("Depodite to "+accNum+" Success");
		System.out.println("Avaiable Balance "+accBal);
	}
}
public class Mainclass5
{
	public static void main(String[] args)
	{
		Account a1=new Account();
		a1.accNum=4548645321546L;
		a1.accBal=1000.0;
		a1.withdraw(2000.0);
		a1.deposite(500.0);
		System.out.println("-----------------------------------------------------------");
		Account a2=new Account();
		a2.accNum=4651354653154L;
		a2.accBal=15000.0;
		a2.deposite(3000.0);
		a2.withdraw(1500.0);
	}
}
