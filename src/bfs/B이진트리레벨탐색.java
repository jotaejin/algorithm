package bfs;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
    }
}

public class B이진트리레벨탐색 {
    Node node;
    public void BFS(Node root){
        Queue<Node> q = new LinkedList();
        q.offer(root);

        int L = 0;
        while (!q.isEmpty()){
            int len = q.size();
            System.out.print(L+"레벨 : ");
            for (int i = 0; i < len; i++) {
                Node current = q.poll();
                System.out.print(current.data);
                if(current.lt != null){
                    q.offer(current.lt);
                }
                if(current.rt != null){
                    q.offer(current.rt);
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        B이진트리레벨탐색 tree = new B이진트리레벨탐색();
        tree.node = new Node(1);
        tree.node.lt = new Node(2);
        tree.node.rt = new Node(3);
        tree.node.lt.lt = new Node(4);
        tree.node.lt.rt = new Node(5);
        tree.node.rt.lt = new Node(6);
        tree.node.rt.rt = new Node(7);
        tree.BFS(tree.node);
    }


    /*Node node;
    public void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;//레벨
        while (!q.isEmpty()){
            int len = q.size();//q의 원소개수
            System.out.print(L+"레벨 : ");
            for (int i = 0; i < len; i++) {//해당 레벨의 원소들을 출력한다
                Node current = q.poll();//꺼내기
                System.out.print(current.data);//해당 노드의 주소값의 data 출력
                if(current.lt!=null){//왼쪽자식이 있다면 q의 삽입
                    q.offer(current.lt);
                }if(current.rt!= null){
                    q.offer(current.rt);
                }
            }
            L++;
            System.out.println();
        }
    }*/
}
