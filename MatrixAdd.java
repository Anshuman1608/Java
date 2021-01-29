import java.util.Scanner;
public class MatrixAdd 
{
    public static void main(String ar[]) 
    {
        Scanner s = new Scanner(System.in);
        int a[][]=new int[2][2];  
        int b[][]=new int[2][2];    
        int c[][]=new int[2][2];
        int i,j;
        System.out.println("Enter first matrix: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("The First matrix is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Enter Second Matrix: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("The Second matrix is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("The Addition of the two matrices is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }

    }   
}
