package algorithm.baekjoon.algoStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        String star = "";

        for(int i=0; i < n; i++){
            star = star + "*";
            System.out.println(star);
        }

        br.close();
    }
}
