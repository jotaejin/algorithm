package Array;

import java.util.Map;
import java.util.Scanner;

public class P임시반장정하기 {
    /*static int cnt;*/
    public static int solution(int n, int[][]arr){
        //i번 학생과 같은 반에있던 j번 학생과 같다면 cnt를 증가해줌 (메서드가 종료될 때 메모리에서 제거)*/
        int answer = 0, max=Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){//i는 학생번호
            int cnt=0;
            for (int j = 1; j <=n; j++) {//i학생과 비교할 j학생
                for(int k=1; k<5; k++){//n학년
                    if(arr[i][k] == arr[j][k]){//ex)1번학생 1학년 == 2번학생 1학년 이라면 cnt++해주고 break
                        cnt++;//i와j 학생의 같은반이라면 cnt++
                        break;
                    }
                }//1학년~5학년
            }
            if(cnt>max){
                max=cnt;
                answer=i;//i번 학생이 임시반장 선정
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];//학생
        for(int i=1; i<=n; i++){//학생번호
            for (int j = 1; j <= 5; j++) {//1학년~5학년
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(n,arr) + "번 학생 임시반장");

    }
}
