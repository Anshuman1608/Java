public class For 
{
    public static void main(String ar[])
    {
        int i, a=10;
        for(i=1;i<=10;i++)
        {
            System.out.println(i+"+"+a+"=");
            a=i+a;
            System.out.println(a);
        }
        System.out.println(a);
        System.out.println("Loop has been terminated");
    }
    
}
