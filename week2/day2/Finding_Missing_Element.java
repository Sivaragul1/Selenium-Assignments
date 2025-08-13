package week2.day2;

import java.util.Arrays;

public class Finding_Missing_Element {

    public static void main(String[] args) {
        
        int a[] = {1, 4, 3, 2, 8, 6, 7};
        Arrays.sort(a); 
        System.out.println("Sorted array: " + Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + 1 != a[i + 1]) {
                System.out.println("Missing element is " + (a[i] + 1));
                break; 
            }
        }
    }
}
