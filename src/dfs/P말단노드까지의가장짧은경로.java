package dfs;

/**
 *제일 짧은 자식노드의 레벨을 출력
 */
class Node1{
    int data;
    Node lt, rt;

    public Node1(int val) {
        data = val;
        lt=rt=null;
    }
}
public class P말단노드까지의가장짧은경로 {
    Node root;
    public int DFS(int L, Node root){
        if(root.lt == null && root.rt == null){
            return L;
        }else{
            return Math.min(DFS(L+1,root.lt),DFS(L+1,root.rt));
        }
    }
    public static void main(String[] args) {
        P말단노드까지의가장짧은경로 tree = new P말단노드까지의가장짧은경로();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0,tree.root));
    }
}
