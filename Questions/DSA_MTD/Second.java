package DSA_MTD;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            System.out.println("Second smallest number is: " + findSecondSmallest(number));
        }
    }

    private static String findSecondSmallest(int number) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int digit;

        while (number > 0) {
            digit = number % 10;
            if (digit < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = digit;
            } else if (digit < secondSmallest && digit != firstSmallest) {
                secondSmallest = digit;
            }
            number /= 10;
        }
        return secondSmallest == Integer.MAX_VALUE ? "No second smallest digit" : String.valueOf(secondSmallest);
    }
}
