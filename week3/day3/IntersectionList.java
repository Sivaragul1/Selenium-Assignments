package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IntersectionList {
    public static void main(String[] args) {
        int first_arr[]= {3, 2, 11, 4, 6, 7};
        int second_arr[]= {1, 2, 8, 4, 9, 7};

        List<Integer> firstlist=new ArrayList<Integer>();
        List<Integer> secondlist=new ArrayList<Integer>();

        // first
        for (Integer first : first_arr)
        {
            firstlist.add(first);
        }
        System.out.println(firstlist);

        for (Integer second :second_arr)
        {
            secondlist.add(second);
        }
        System.out.println(secondlist);

        // Second
        for (Integer integer : firstlist) {
            for (Integer value : secondlist) {
                if (Objects.equals(integer, value)) {
                    System.out.println("The numbers are:" + integer);
                }
            }
        }

    }
}