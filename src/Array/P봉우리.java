package Array;

import java.util.Scanner;

public class P봉우리 {
     int[] dx = {-1,0,1,0};
     int[] dy = {0,1,0,-1};
    public  int solution(int n, int[][] arr){
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;//봉우리 인지 아닌지
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];//4방향을 보기위한 행좌표
                    int ny=j+dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }//i,j의 12시,3시,6시,9시 탐색
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P봉우리 p봉우리 = new P봉우리();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(p봉우리.solution(n,arr));
    }
}
