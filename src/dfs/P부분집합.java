package dfs;

public class P부분집합 {
    static int n;//집합 원소의 개수
    static int[] ch;//체크 배열
    public static void DFS(int L){
        if(L==n+1){//L이 4라면 부분집합의 경우가 하나 만들어짐
            String tmp = "";//부분집합
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) { //체크됐다면
                    tmp += (i + " ");
                }
            }
            if(tmp.length()>0){//공집합이 아닐때
                System.out.println(tmp);
            }

        } else {//두 갈래로 뻗어나감
            ch[L]=1;//원소를 사용한다
            DFS(L + 1);//노드 왼쪽
            ch[L] = 0;//사용하지 않는다
            DFS(L+1);//오른쪽
        }
    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n+1];//1~3까지
        DFS(1);
    }
}
