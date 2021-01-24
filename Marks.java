import java.util.Scanner;
class Marks
{
	public static void main(String ar[])
	{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter You Marks in ");
        System.out.println("Physics");
        double p = s.nextDouble(); 
        System.out.println("Chemistry");
        double c = s.nextDouble(); 
        System.out.println("Maths");
        double m = s.nextDouble(); 
        System.out.println("Computers");
        double i = s.nextDouble(); 
        System.out.println("English");
        double e = s.nextDouble(); 

        double sum = p+c+m+i+e;
        double per = (sum*100)/500;

        if (per>=90)
        {
            System.out.println("Your grade is A");
        }
        else if(per < 90 && per >=70)
        {
            System.out.println("Your grade is B");
        }
        else if(per<70 && per >=60)
        {
            System.out.println("Your grade is c");
        }
        else if(per<60 && per >= 40)
        {
            System.out.println("Your grade is D");
        }
        else if(per<40)
        {
            System.out.println("Better Luck Next Time");
        }
        else
        {
            System.out.println("Enter Correct Value");
        }
        System.out.println("Your percentage is: "+ per);
    }
}