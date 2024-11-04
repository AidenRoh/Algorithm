package algorithm.basic.twopointers;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Main3 main = new Main3();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        main.solution(a, b, arr);
    }

    public void solution(int a, int b, int[] arr){
        int answer = 0;
        int window = 0;

        for (int i = 0; i < b; i++) {
            window += arr[i];
            answer = window;
        }

        for (int i = 1; i < a - b; i++) {
            window = window - arr[i - 1] + arr[i + b - 1];
            if (window > answer) answer = window;
        }

        System.out.print(answer);
    }

    public void solution2(int a, int b, int[] arr) {
        int answer = 0, lt = 0, sum = 0;
        for (int rt = 0; rt < a; rt++) {
            sum += arr[rt];
            if (sum == b) answer++;
            while (sum >= b) {
                sum -= arr[lt++];
                if (sum == b) answer++;
            }
        }
        System.out.print(answer);
    }
}
