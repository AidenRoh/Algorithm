package algorithm.basic.number;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args){
        Main4 main = new Main4();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        main.solution(input);
    }

    public void solution(int input){
        int[] fibonacci = new int[input + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        System.out.print(fibonacci[1]);
        for (int i = 2; i < input + 1; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            System.out.print(" " + fibonacci[i]);
        }
    }
}
