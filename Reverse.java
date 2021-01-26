import java.util.Scanner;
public class Reverse 
{
    public static void main(String ar[])
    {
        int n, r,sum=0,temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        n=s.nextInt();
        temp = n;
        while(n>0)
        {
            r=n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        System.out.println("Reverse number = "+sum);
    }
    
}
