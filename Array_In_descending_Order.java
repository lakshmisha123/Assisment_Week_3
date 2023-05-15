package Java_Assisment_3ed_week;

import java.util.Scanner;

public class Array_In_descending_Order {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Size Of Array:\t");
        int size= sc.nextInt();
        int values[]=new int[size];
        System.out.print("Enter The "+size+ " values Of Array:\t");
        for (int i=0;i<size;i++){
            values[i]=sc.nextInt();
        }
        int x=0;
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if (values[i]<values[j])
                {
                    x=values[i];
                    values[i]=values[j];
                    values[j]=x;
                }
            }
            System.out.println(values[i]);
        }
    }
}
