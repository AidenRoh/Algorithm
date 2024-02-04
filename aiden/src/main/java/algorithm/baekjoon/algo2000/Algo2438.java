package algorithm.baekjoon.algo2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo2438 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NumberFormatException, IOException {

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb1.append("*");
            sb2.append(sb1+"\n");
        }
        System.out.println(sb2);
    }
}
