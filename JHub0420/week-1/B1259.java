package BaekJoon.B1259;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();

        int i = 0;

        do {
            String input = sc.next();
            if (input.equals("0")) break; 
            arr.add(input);
            i++;  
        } while (true);
      
        for (int j = 0; j < arr.size(); j++) {
            String word = arr.get(j);
            int left = 0;
            int right = word.length() - 1;

            boolean isPalindrome = true;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                s.add("yes");
            } else {
                s.add("no");
            }
        }

        for (String result : s) {
            System.out.println(result);
        }
    }
}

