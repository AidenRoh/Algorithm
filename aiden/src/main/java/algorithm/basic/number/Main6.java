package algorithm.basic.number;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args){
        Main6 main = new Main6();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] numbers = new int[number];
        for(int i = 0; i < number; i++){
            numbers[i] = sc.nextInt();
        }
        main.solution(number, numbers);
    }

    public void solution(int number, int[] numbers){
        // get reversed array
        int biggest = 0; // get the biggest number for prime
        int[] reversedArr = new int[number];

        for (int i = 0; i < number; i++) {
            int tmp = numbers[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            reversedArr[i] = res;
            if (res > biggest) biggest = res;
        }

        // prime logic by biggest number
        boolean[] prime = new boolean[biggest + 1]; // include 0;
        prime[0] = prime[1] = true; // not prime number
        for (int i = 2; i*i <= biggest; i++){
            if(!prime[i]){
                for (int j = i*i; j <= biggest; j += i){
                    prime[j] = true;
                }
            }
        }

        //get result
        for (int i = 0; i < number; i++){
            int target = reversedArr[i];
            if (!prime[target]) System.out.print(target + " ");
        }
    }
}
