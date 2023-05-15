package Java_Assisment_3ed_week;

import java.util.Scanner;

public class Fibonacci_Series_Of_Numbers {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number upto which fibonacci series needed:\t");
            int n= sc.nextInt(), firstTerm = 0, secondTerm = 1, nextTerm;
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + ",");

               nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
