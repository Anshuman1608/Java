import java.util.Scanner;
public class Nested 
{
    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter Second Number");
        int b = s.nextInt();
        if(a>b)
        {
            if(b>0)
            {
                System.out.println("A is positive");
            }
            else
            {
                System.out.println("A is positive but B is not");
            }
        }
        else
        {
            if(a>0)
            {
                System.out.println("B is positive");
            }
            else
            {
                System.out.println("B is positive but A is not");
            }
        }
        System.out.println("Exit");
    }    
}
