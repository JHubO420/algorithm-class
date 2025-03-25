package BaekJoon.Test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1920 {
    public static int binarySearch(int[] a, int taget){
        int left = 0;
        int right = a.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(a[mid]==taget){
                return 1;
            } else if (a[mid] < taget) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
        int M = Integer.parseInt(br.readLine());
        String[] v = br.readLine().split(" ");
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(v[i]);
        }

        Arrays.sort(A);
        for (int i = 0; i < B.length; i++) {
            System.out.println(binarySearch(A, B[i]));
        }

    }
}
