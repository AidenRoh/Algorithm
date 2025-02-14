package algorithm.basic.queue;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args){
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);
        String mandatory = sc.nextLine();
        String allLecture = sc.nextLine();
        main.solution(mandatory, allLecture);
    }

    public void solution(String mandatory, String allLecture){
        Queue<Character> queue = new LinkedList<>();
        String result = "NO";
        for (char each : mandatory.toCharArray()) queue.offer(each);
        for (char each : allLecture.toCharArray()){
            if (queue.isEmpty()){
                result = "YES";
                break;
            }

            if (each == queue.peek()) queue.poll();
        }
        System.out.print(result);
    }

    public void solution2(String mandatory, String allLecture){
        Queue<Character> queue = new LinkedList<>();
        String result = "YES";
        for (char each : mandatory.toCharArray()) queue.offer(each);
        for (char each : allLecture.toCharArray()){
            if (queue.contains(each)) {
                if (each != queue.poll()){
                    result = "NO";
                    break;
                }
            }
        }
        if (!queue.isEmpty()) result = "NO";
        System.out.print(result);
    }
}