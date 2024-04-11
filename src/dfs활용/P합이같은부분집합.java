package dfs활용;

import java.util.Scanner;

/**
 * dfs(L+1, sum+arr[L], arr); 재귀를 하다가 (sum>total/2) 가 참이되면 return 이 되어서
 * dfs(L+1, sum,arr) 여기로 오게됨
 * return 을 만나게되면 dfs 교체
 */
public class P합이같은부분집합 {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;
    public static void dfs(int L, int sum, int[] arr){
        if(flag) return;//조건문을 만족하면 dfs빠져나옴
        if(sum>total/2) return;//sum 이 total/2 라면 백트래킹
        if(L==n){//부분집합 완성
            if((total - sum) == sum){//Total 값에서 sum 을 뺀 값이 sum 이라면 부분집합이 완성
                answer = "YES";//두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력
                flag = true;//더이상 dfs 돌지않음
                return;
            }
        }else{//레벨이 n이 아닐때
            dfs(L+1, sum+arr[L], arr);//부분집합 사용(레벨,sum)
            dfs(L+1, sum,arr);//부분집합 사용x
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
