package dfs활용;

import java.util.Scanner;

/**
 * dfs 다 돌면서 부분집합중 가장 무거운 무게를 출력
 */
public class P바둑이승차 {
    static int answer = Integer.MIN_VALUE, c, n;

    public void dfs(int l, int sum, int[] arr){
        if(sum > c) return;//sum 이 최대무게보다 크다면 빠져나온다
        if(l == n){
            answer = Math.max(answer,sum);
        }else{//l과n이 다를때 dfs를 반복한다.
            dfs(l+1,sum+arr[l],arr);
            dfs(l+1,sum,arr);
        }
    }

    public static void main(String[] args) {
        P바둑이승차 t = new P바둑이승차();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        t.dfs(0,0,arr);
        System.out.println(answer);
    }
}
