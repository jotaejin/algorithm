package dfs활용;

import java.util.Scanner;

public class P최대점수구하기 {
    static int answer = Integer.MIN_VALUE, n,m;
    boolean flag = false;
    public static void dfs(int l, int sum, int time, int[] ps, int[] pt){
        if(time > m) return;
        if(l == n){
           answer =  Math.max(answer,sum);
        }else{
            dfs(l+1,sum+ps[l],time+pt[l],ps,pt);
            dfs(l+1,sum,time,ps,pt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] score = new int[n];
        int[] time = new int[m];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        dfs(0,0,0,score,time);
        System.out.println("최대 점수는: " + answer + "점");
    }
}
