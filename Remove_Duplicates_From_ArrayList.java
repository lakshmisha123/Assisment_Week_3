package Java_Assisment_3ed_week;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Remove_Duplicates_From_ArrayList {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter integers to form array list :\t");
        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        System.out.println("ArrayList with duplicates: "+ list);

        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("ArrayList without duplicates: \t"+ newList);
    }
}
