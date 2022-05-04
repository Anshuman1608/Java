package Java;
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        //Create an Array
        /* 1. Declare an Array ---> datatype[] variable_name
        *  2. Initialize an Array ---> new datatype[size_of_array]
        *  3. To Insert elements
        * */

        //Step 1.
        int[] arr;
        //Step 2.
        arr=new int[10];
        //Step 3.
        //arr={1,2,3,4,5,6,7,8,9,10};

        int[] roll=new int[10];
        String[] name=new String[10];
        //Hardcoded Value
        int rolln=1,index=0;
        while (index<10)
        {
            roll[index]=rolln;
            index++;rolln++;
        }
        //Inserting User Input in Name Array
        Scanner s=new Scanner(System.in);
        for(int i=0;i< name.length;i++)
        {
            System.out.println("Enter Student Name"+(i+1)+": ");
            name[i]=s.nextLine();
        }
        //Printing the value
        for(int i=0;i< roll.length;i++)
        {
            System.out.print(roll[i]+ " ");
        }

        System.out.println("");
        for (int i=0;i<name.length;i++)
        {
            System.out.print(name[i]+" ");
        }

    }
}
