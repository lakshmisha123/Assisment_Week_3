package Java_Assisment_3ed_week;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurrences_Character_String_Map {
    public static void main( String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Sentence:\t");
        String str=sc.nextLine();
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();

        char[] arr = str.toCharArray();
        for(char c:arr){

            if(c != ' '){
                if(count.containsKey(c)){
                    count.put(c, count.get(c) + 1);
                }else{
                    count.put(c,1);
                }
            }
        }
        for(Map.Entry entry : count.entrySet()){
            System.out.println(" Occurrences of " + entry.getKey() + " = " + entry.getValue());
        }
    }
}
