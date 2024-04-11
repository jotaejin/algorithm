package dfs.P경로탐색;

import java.util.Scanner;

/**
 * 1번 정점에서 n번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램
 */
public class P경로탐색 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n){
            answer++;//목표 노드에 도착
        }else{
            for (int i = 1; i <= n; i++) {
                if(graph[v][i] == 1 && ch[i] == 0){//정점에서 i로
                    ch[i] = 1;//방문한 노드 체크
                    DFS(i);
                    ch[i] = 0;//백하면 체크배열 풀어주기(i=5되면 일로오게됨)
                }
            }
        }
    }

    public static void main(String[] args) {
        P경로탐색 t = new P경로탐색();
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();//노드의 개수
         m = sc.nextInt();//간선의 개수
        graph = new int[n+1][n+1];//1~n 번까지
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;//a->b
        }
        ch[1] = 1;//노드 1번은 default 가 체크임
        t.DFS(1);
        System.out.println(answer);
    }



}
