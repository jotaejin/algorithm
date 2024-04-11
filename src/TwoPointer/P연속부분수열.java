package TwoPointer;

import java.util.Scanner;

public class P연속부분수열 {
    public static int solution(int n, int m, int[] arr){
        int answer = 0, sum = 0, lt=0,rt=0;

        while (rt<n){
            sum+= arr[rt++];
            if(sum == m){
                answer++;
            }else if(sum >= m){
                sum -= arr[lt++];
                if(sum == m){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//수열의 개수
        int m = sc.nextInt();//수열의 합이되는 숫자
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n,m,arr));
    }
}
