package dfs;

/**
 * 한번 다녀온 노드는 다시 오지않는다.
 */
class Node{
    int data;//데이터값
    Node lt,rt;

    public Node(int val) {
        this.data = val;
    }
}

public class P이진트리순회 {
    public void dfs(Node node){
        if(node==null){//기준노드의 자식노드가 없다면 빠져나온다.
            return;
        }else{//노드가 왼쪽 오른쪽으로 뻗어 나가야하므로
            System.out.print(node.data+" ");
            dfs(node.lt);//tree.root을 기준으로 왼쪽 자식 노드끝가지의 깊이탐색을 시작한다
            dfs(node.rt);
        }
    }

    Node node;

    public static void main(String[] args) {
        P이진트리순회 tree = new P이진트리순회();
        tree.node = new Node(1);
        tree.node.lt = new Node(2);
        tree.node.rt = new Node(3);
        tree.node.lt.lt = new Node(4);
        tree.node.lt.rt = new Node(5);
        tree.node.rt.lt = new Node(6);
        tree.node.rt.rt = new Node(7);
        tree.dfs(tree.node);//100번지부터 순회 시작
    }
}
