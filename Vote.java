import java.util.Scanner;
class Vote
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int a = s.nextInt();
		if(a>=18)
		{
			System.out.println("You are Eligible");
		}
		else
		{
			System.out.println("You are not Eligible");
		}
	}
}		