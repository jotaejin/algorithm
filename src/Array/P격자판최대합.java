package Array;

import java.util.Scanner;

public class P격자판최대합 {
    public static int solution(int n,int[][] arr){
        int answer = Integer.MIN_VALUE;//행,열,대각선중 제일 큰 값 저장
        int sum1, sum2 ; //sum1 = 행의 합, sum2 = 열의 합

        for (int i = 0; i < n; i++) {//행
            sum1=sum2=0;//초기화
            for (int j = 0; j < n; j++) {//열
                sum1+= arr[i][j];//i가 0일때 j가0~4까지 반복
                sum2+= arr[j][i];//열번호 고정 행 이동
            }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
        }

        sum1=sum2=0;//대각선의 합
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer,sum1);
        answer=Math.max(answer,sum2);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(n,arr));
    }
}
