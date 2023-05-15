package Java_Assisment_3ed_week;

import java.util.Scanner;

public class Number_Is_Prime_Or_Not {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number Which We Want to Know Prime or not:\t");
        int num= sc.nextInt();
        int count=0;
        for (int i=2;i<num;i++){
            if (num%i==0){
                count=count+1;
            }
        }
        if (count==0){
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+" is not a prime number");
        }
    }
}
