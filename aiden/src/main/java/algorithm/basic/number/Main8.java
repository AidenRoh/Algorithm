package algorithm.basic.number;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Long;

public class Main8 {

    public static void main(String[] args){
        Main8 main = new Main8();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] scores = new int[number];
        for (int i = 0; i < number; i++){
            scores[i] = sc.nextInt();
        }
        main.solution(number, scores);
    }

    public static void solution(int number, int[] scores) {
        int[] result = new int[number];
        int count = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (scores[i] < scores[j]) count++;
            }
            result[i] = count;
            count = 1;
        }
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));
    }
}
