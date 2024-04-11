package TwoPointer;

import java.util.ArrayList;
import java.util.Scanner;

//투 포인터 문제
public class P두배열합치기 {
    public static ArrayList<Integer> solution(int n, int m, int[]a, int[]b){
        ArrayList<Integer> answer = new ArrayList<>();//두 배열을 합치기위한 자료구조
        int p1=0;//n을 이동하기 위한 변수
        int p2=0;

        while (p1<n && p2<m){
            if(a[p1] < b[p2]){
                answer.add(a[p1++]);
            }else{
                answer.add(b[p2++]);
            }
        }

        while (p1<n){
            answer.add(a[p1++]);
        }

        while (p2<m){
            answer.add(b[p2++]);
        }

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for(int x : solution(n,m,a,b)){
            System.out.print(x+" ");
        }
    }
}
