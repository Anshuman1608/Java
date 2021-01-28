import java.util.Scanner;
public class Matrix
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int r = s.nextInt();
        int c = s.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the elements of the Matrix");
        for(int i=0; i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Elements of the Matrix are : ");
        for(int i=0; i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
}
