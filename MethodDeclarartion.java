package Java;

import java.util.Scanner;

public class MethodDeclarartion {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int greater=greater(a,b,c);
    System.out.println(greater);
    }
    private static int greater(int a, int b, int c)
    {
        int greater=0;
        if(a>b)
        {
            if(a>c)
            {
                greater=a;
            }
            else
            {
                greater=c;
            }
        }
        else
        {
            if(b>c)
            {
                greater=b;
            }
            else
            {
                greater=c;
            }
        }
        return greater;
    }

}
