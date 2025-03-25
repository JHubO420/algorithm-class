package BaekJoon.Test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2139 {
    // 월별 일수를 저장한 배열 (윤년 고려하지 않음)
    static int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int getDay(int mo, int year) {
        if(mo ==  2){
            // 윤년인 경우 2월은 29일
            return isLeapYear(year) ? 29 : 28;
        }
        return daysInMonth[mo];
    }
    //윤년 판별
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int []> arr = new ArrayList<>();

        StringTokenizer st;
        while (true){
            st = new StringTokenizer(br.readLine()," ");
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            if(day==0 && month==0 && year==0){
                break;
            }

            //배열을 ArrayList에 저장
            arr.add(new int[] {day, month, year});
        }

        for (int[] date : arr) {
            int day = date[0];
            int month = date[1];
            int year = date[2];

            int total = 0;

            for (int i = 1; i < month; i++) {
                total += getDay(i, year);
            }

            total += day;
            System.out.println(total);
        }
    }
}
