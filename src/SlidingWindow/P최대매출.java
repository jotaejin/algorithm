package SlidingWindow;

import java.util.Scanner;

public class P최대매출 {
    private static int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i = 0; i < k; i++) { //슬라이딩 윈도우 만들기
            sum += arr[i];
            answer = sum;
        }
        for(int i=k; i<n; i++){
            sum+=(arr[i]-arr[i-k]);//이동하기
            answer = Math.max(answer,sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//매출 기록
        int k = sc.nextInt();//연속된 n일
        int[] arr = new int[n];//매출기록 담는 배열
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n,k,arr));
    }


}
