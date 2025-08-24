package week3.day3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetInterface {

    public static void main(String[] args) {
        String companyName = "google";
        char[] name = companyName.toCharArray();


        Set<Character> unique=new LinkedHashSet<Character>();

        for (int i = 0; i < name.length; i++) {


            unique.add(name[i]);

        }

        System.out.println("Uniq characters are" +unique);

    }

}
