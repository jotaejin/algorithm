package dfs.P경로탐색;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 인접리스트 {
    public static final int MAX = 20 + 10;
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] isVisited;
    public static void dfs(int idx){
        if(idx == n) answer++;//정점 n에 도착하면 answer 증가
        else{
            for (int next : graph.get(idx)) {
                if(isVisited[next] == false){
                    isVisited[next] = true;
                    dfs(next);
                    isVisited[next] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n ; i++) {
            graph.add(new ArrayList<Integer>());//동적 배열 생성
        }
        isVisited = new boolean[MAX];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
        }
        isVisited[1] = true;
        dfs(1);
        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}
