package dfs;

public class Dfs {
    public static void DFS(int n){
        if(n==0) {
            return;
        }
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
