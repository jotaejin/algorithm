package Array;

import java.util.Arrays;
import java.util.Scanner;

public class P등수구하기 {
    public static int[] solution(int student, int[] arr){
        int[] answer = new int[student];
        for (int i = 0; i < student; i++) {
            int cnt = 1;
            for (int j = 0; j < student; j++) {
                if(arr[i] < arr[j]){
                    cnt++;//등수
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int [] arr = new int[student];
        for (int i = 0; i < student; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x: solution(student,arr)){
            System.out.print(x+" ");
        }
    }
}
