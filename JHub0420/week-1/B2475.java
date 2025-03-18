package BaekJoon.B2475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        String numbers = sc.nextLine();
        String[] nums = numbers.split(" ");

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(nums[i]);
            num[i] *= num[i];
            sum += num[i];
        }

        System.out.println(sum%10);
    }
}
