package algorithm.basic.number;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args){
        Main5 main = new Main5();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        main.solution(input);
    }

    public void solution(int input){
        boolean[] prime = new boolean[input+1];
        // true = non-prime / false = prime
        prime[0] = prime[1] = true;

        for(int i = 2; i*i <= input; i++){
            if(!prime[i]){
                for(int j = i*i; j <= input; j += i){
                    prime[j] = true;
                }
            }
        }

        int count = 0;
        for (boolean each : prime) {
            if (!each) count++;
        }

        System.out.println(count);
    }
}
