package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VisibleStudent {
    public static int solution(int n,int[]num){
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if(num[i] > num[i-1]){
                answer++;
            }
        }
        return answer;
    }
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n+1];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(solution(n,num));
    }
}
