package Java_Assisment_3ed_week;

import java.util.Scanner;

public class String_is_Palindrome_or_not {
    public static void main(String[] args){
        String output="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String to be tested:\t");
        String input= sc.nextLine();
        for (int i=input.length()-1;i>=0;i--){

            output=output+input.charAt(i);
        }
        System.out.println(output);
        if (input.equals(output)){
            System.out.println(input+"\t:is a Palindrome String ");
        }else {
            System.out.println(input+"\t:is not a Palindrome String ");
        }
    }
}
