import java.util.Scanner;
public class SimpleArray {
    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);
        int a[] = new int[5]; int i;
        System.out.println("Enter 5 elements in the array");
        for(i=0; i<a.length; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Your elements are as follows");
        for(i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
