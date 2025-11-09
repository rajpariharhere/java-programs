import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Not Even Number");
		}
	}
}