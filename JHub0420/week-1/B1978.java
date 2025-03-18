import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;

        n = sc.nextInt();
        sc.nextLine(); 

        String num = sc.nextLine();

        String[] numbers = num.split(" ");

        int[] nums = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int con = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if(nums[i]%j==0){
                    con++;
                }
            }
            if(con==2){
                count++;
            }
        }

        System.out.println(count);
    }
}
