package BaekJoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int[] num = new int[7];
        int idx1 = 0, idx2 = 0;
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            nums.add(sc.nextInt());
            sum += nums.get(i);
        }
        //우선 아홉 난쟁이들의 키를 모두 더하고, 100을 뺍니다.
        //처음 일곱 난쟁이가 아닌 나머지 둘의 키와 같습니다.
        sum -= 100;

        //2명을 찾기 위해 완전 탐색을 합니다.
        //항상 두명을 찾아야 하므로, i는 7까지, j는 8까지 탐색합니다.
        //이때 j는 i + 1부터 탐색해도 충분합니다. i이하의 난쟁이를 선택하는 것은 기존 결과와 중복됩니다.
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (sum == nums.get(i) + nums.get(j)) {
                    idx1 = i;
                    idx2 = j;
                }
            }
        }

        // idx1과 idx2를 큰 값부터 제거
        //더 큰 인덱스를 먼저 제거하면 뒤에 있는 값들의 인덱스가 바뀌지 않아서 문제가 발생하지 않습니다.
        if (idx1 > idx2) {
            nums.remove(idx1);
            nums.remove(idx2);
        } else {
            nums.remove(idx2);
            nums.remove(idx1);
        }

        // 나머지 난쟁이들 출력
        //ArrayList 정렬
        nums.sort(Comparator.naturalOrder());

        for (int i = 0; i < 7; i++) {
            System.out.println(nums.get(i));
        }
    }
}
