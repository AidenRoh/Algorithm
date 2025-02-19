package algorithm.baekjoon.algoStar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number - i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
