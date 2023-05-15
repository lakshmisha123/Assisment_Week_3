package Java_Assisment_3ed_week;

import java.util.Arrays;
import java.util.Scanner;

public class String_Anagram_Or_Not {

    public static boolean isAnagram(char[] first,char[] second) {
        if(first.length!=second.length) {
            return false;
        }
        for(int i=0;i<first.length;i++) {
            if(first[i]!=second[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])  {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the first String:\t");
            String first_string=sc.nextLine();

            System.out.println("Enter the second String:\t");
            String second_string=sc.nextLine();

            first_string=first_string.toLowerCase();
            second_string=second_string.toLowerCase();

            char[] first_array=first_string.toCharArray();
            char[] second_array=second_string.toCharArray();

            Arrays.sort(first_array);
            Arrays.sort(second_array);

            //calling isAnagram  boolean function
            if(isAnagram(first_array,second_array)) {
                System.out.println("Two Strings are Anagrams");
            }else {
                System.out.println("Two Strings are not Anagrams");
            }

        }
    }
