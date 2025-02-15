package algorithm.basic.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main3 {

    static class Person{
        int index;
        int priority;

        public Person(int index, int priority){
            this.index = index;
            this.priority = priority;
        }
    }

    public static void main(String[] args){
        Main3 main = new Main3();
        Scanner sc = new Scanner(System.in);
        int patientScale = sc.nextInt();
        int target = sc.nextInt();
        int[] patients = new int[patientScale];
        for (int i = 0; i < patientScale; i++){
            patients[i] = sc.nextInt();
        }
        main.solution(target, patients);
    }

    public void solution(int target, int[] patients){
        Queue<Person> q = new LinkedList<>();
        int answer = 0;
        for (int i = 0; i < patients.length; i++){
            q.offer(new Person(i, patients[i]));
        }

        while(!q.isEmpty()){
            Person tmp = q.poll();
            for (Person each : q){
                if (each.priority > tmp.priority){
                    q.add(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp != null){
                answer++;
                if (tmp.index == target) break;
            }
        }
        System.out.print(answer);
    }
}
