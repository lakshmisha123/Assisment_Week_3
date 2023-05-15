package Java_Assisment_3ed_week;

import java.util.Scanner;

public class Factorial_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number For Which Factorial is Needed:\t");
        int Num= sc.nextInt();
        int fac=1;
        for (int i=2;i<=Num;i++){
            fac=fac*i;
        }
        System.out.println(fac);
    }
}
