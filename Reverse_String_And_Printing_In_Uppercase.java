package Java_Assisment_3ed_week;

import java.util.Scanner;

public class Reverse_String_And_Printing_In_Uppercase {
    public static void main(String[] args){
        String output="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String Which is to be reversed and to be in Uppercase:\t");
        String input=sc.nextLine();
        for (int i=input.length()-1;i>=0;i--){
            output=output+input.charAt(i);
        }
        output=output.toUpperCase();
        System.out.println("The String Which is reversed and in Uppercase is:\t"+output);
    }
}
