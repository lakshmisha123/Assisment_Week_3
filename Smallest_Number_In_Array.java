package Java_Assisment_3ed_week;

import java.util.Scanner;

public class Smallest_Number_In_Array {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size Of array:\t");
        int size= sc.nextInt();

        int[] values= new int[size];
        System.out.print("Enter the "+size+ "\t values Of array:");

        for(int i=0; i<size; i++)
            values[i] = sc.nextInt();

        int Small_Number_In_Array = values[0];
        for(int i=0; i<size; i++)
        {
            if(Small_Number_In_Array>values[i])
                Small_Number_In_Array = values[i];
        }

        System.out.println("\nSmallest Number is = " +Small_Number_In_Array);
    }

}
