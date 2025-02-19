package algorithm.baekjoon.algoStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        br.close();

        String star = "";

        for(int i = 1; i <= number; i++){
            for(int j = 0; j < number - i; j++){
                System.out.print(" ");
            }
            star += "*";
            System.out.println(star);
        }
    }
}
