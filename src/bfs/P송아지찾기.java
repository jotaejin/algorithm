package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 사람의 위치 s와 송아지 위치e를 매개변수로갖는 bfs가있다.
 * s에서 e까지 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
 * 최소 몇 번의 점프로 s가 e까지 갈 수 있는지 구하는 문제이다.
 * 체크 배열을 생성해서 자식노드가 겹치지않도록 해준다.
 * Queue에 현재위치를 넣고 트리가 내려가면서 자식노드까지 넣어준다.
 */
public class P송아지찾기 {
    static int answer = 0;
    static int[] dis={1,-1,5};//점프 길이
    static int[] ch;//체크배열(그 숫자가 이미 있다면 q에 넣어서는안된다)
    static Queue<Integer> q = new LinkedList<>();
    public static int bfs(int s,int e) {//현재 위치, 송아지 위치
        ch = new int[10001];//좌표
        ch[s] = 1;//체크 배열(자식노드가 이미 방문했으면 queue 에 넣으면 안되므로)
        q.offer(s);//현재위치 넣기
        int L = 0;//레벨

         while (!q.isEmpty()){//레벨 길이 구하기
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();//q에있는 노드를 꺼내서 x에 삽입
                for (int j = 0; j < 3; j++) {
                    int nx = x+dis[j];//자식노드(Queue 에 집어넣을려는 값)
                    if(nx == e) return L+1;//자식 노드이기때문에 L+1(자식 노드가 송아지 위치라면 리턴해준다)
                    if(nx>=1 && nx<=10000 && ch[nx]==0){//ch[nx]==0 이면 아직 방문안함
                        ch[nx]=1;//체크 배열에 1을 넣어주면 방문노드를 알 수 있다
                        q.offer(nx);//자식 노드 q에 넣어주기
                    }
                }
            }//그 레벨은 다 탐색
            L++;
        }




        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s,e));
    }
}
