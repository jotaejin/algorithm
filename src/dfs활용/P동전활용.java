package dfs활용;

import java.util.Scanner;

public class P동전활용 {
    static int n,m,answer = Integer.MAX_VALUE;
    public static void dfs(int l, int sum, int[] arr){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            m = sc.nextInt();//동전 종류
        }

        dfs(0,0,arr);
        System.out.println(answer);//동전의 최소개수
    }
}
