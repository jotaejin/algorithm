package stackQueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이 문제는 m번째 환자가 몇번째로 진료를 받는지 알려주는 문제이다.
 */
class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;//환자의 번호
        this.priority = priority;//환자의 위험도
    }
}
public class P응급실 {
    public static int solution(int n, int m, int[] arr){
        int answer = 0;//환자의 위험순위가 몇번째인지 알려주는 변수
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Person(i,arr[i]));//환자 접수
        }

        while (!q.isEmpty()){
            Person tmp = q.poll();
            for (Person x : q) {
                if (x.priority > tmp.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
                if(tmp != null){
                    answer++;
                    if(tmp.id == m){
                        return answer;
                }
            }
        }
        return answer;
















        /*while (!q.isEmpty()){
            Person tmp = q.poll();//맨 앞 환자를 꺼내서 뒷 환자들과 위험도를 비교한다
            for (Person x : q){
                if(x.priority > tmp.priority){//앞 환자보다 뒤 환자의 위험도가 높다면
                    q.offer(tmp);//앞에 환자를 맨 뒤로 보낸다
                    tmp = null;//null 을 해놔야 위험순위를 올리지않는다
                    break;//뒤로 보내줬으면 반복문 빠져나오기
                }
            }
            if(tmp != null){//tmp가 null이 아니라면 1순위로 치료받는 환자
                answer++;//최고 위험순위 환자라면 answer++ 해주어서 1,2,3 순위로 치료를 받는다
                if(tmp.id == m){
                    return answer;
                }
            }
        }*/


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }
}
