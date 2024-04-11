package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * bfs를 사용해서 가장 자식노드의 레벨이 짧은 레벨을 출력한다.
 *
 */
class Node3{
    int data;
    Node3 lt,rt;
    public Node3(int val) {
        data = val;
        lt=rt=null;
    }
}
public class P말단노드짧은경로 {
    Node3 root;
    public int BFS(Node3 root){
        Queue<Node3> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++){
                Node3 cur = q.poll();//q를 꺼내고
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) q.offer(cur.lt);
                if(cur.rt != null) q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        P말단노드짧은경로 tree = new P말단노드짧은경로();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);
        System.out.println(tree.BFS(tree.root));
    }
}
