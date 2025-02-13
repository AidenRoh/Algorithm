package algorithm.basic.queue;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args){
        Main1 main = new Main1();
        Scanner sc = new Scanner(System.in);
        int participant = sc.nextInt();
        int out = sc.nextInt();
        main.solution(participant, out);
    }

    public void solution(int participant, int out){
        Queue<Integer> queue = new LinkedList<>();
        int indicator = 1;
        int answer = 0;
        for (int i = 1; i <= participant; i++) queue.offer(i);

        while (!queue.isEmpty()){
            if (indicator % out != 0) {
                int pollValue = queue.poll();
                queue.offer(pollValue);
            } else answer = queue.poll();
            indicator++;
        }
        System.out.print(answer);
    }
}