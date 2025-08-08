package week1.day2;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        int count=0;
        
        for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

        if (count==0) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }

        scanner.close();
    }
}
