package BaekJoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        final int MAX_E = 15;
        final int MAX_S = 28;
        final int MAX_M = 19;

        //처음 시작은 1년부터 시작합니다.처음 시작은 1년부터 시작합니다.
        int year = 1;
        int e = 1, s = 1, m = 1;

        //주어진 E, S, M과 일치할 때 까지 각 나라의 연도를 1년씩 증가합니다.
        //나라의 최대 연도로 나눈 나머지로 변경하기 때문에 나머지 연산의 순서가 중요합니다.
        while (e != E || s != S || m != M){
            e = (e % MAX_E) + 1;
            s = (s % MAX_S) + 1;
            m = (m % MAX_M) + 1;
            year += 1;
        }

        System.out.println(year);
    }
}
