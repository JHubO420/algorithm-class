package BaekJoon;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // `nextInt()` 후에 `nextLine()`을 호출하여 입력을 정확히 받도록 함.

        ArrayList<String> oldLi = new ArrayList<String>();
        List<String> words = new ArrayList<>();

        // 단어 입력 받기
        for (int i = 0; i < n; i++) {
            oldLi.add(sc.nextLine());
        }

        //중복 제거
        for(String strValue : oldLi) {
            // 중복 요소가 없는 경우 요소를 추가
            if(!words.contains(strValue)) {
                words.add(strValue);
            }
        }

        // 정렬 기준: 길이 오름차순, 길이가 같으면 사전 순
        Collections.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);  // 길이가 같으면 사전 순으로 정렬
            }
            return Integer.compare(a.length(), b.length());  // 길이에 따라 오름차순 정렬
        });

        // 출력 성능 향상: StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }

        // 한 번에 출력
        System.out.print(sb.toString());
    }
}
