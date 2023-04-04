package lab2Algo;

import java.util.Arrays;
import java.util.Scanner;

public class currency {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of currency denominations: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Enter the currency denominations value:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.print("Enter the amount you want to pay: ");
        int amount = sc.nextInt();
        Arrays.sort(x);
        int[] counts = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (x[i] <= amount) {
                counts[i] = amount / x[i];
                amount %= x[i];
            }
        }
        System.out.println("Your payment approach in order to give min no of notes will be:");
        for (int i = n - 1; i >= 0; i--) {
            if (counts[i] > 0) {
                System.out.println(x[i] + ":" + counts[i]);
            }
        }
    }
}
