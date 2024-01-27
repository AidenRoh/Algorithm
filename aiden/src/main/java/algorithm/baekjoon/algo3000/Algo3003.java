package algorithm.baekjoon.algo3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo3003 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int[] original = new int[]{1,1,2,2,2,8};

            for(int i = 0; i < 6; i++){
                System.out.println(original[i] - Integer.parseInt(st.nextToken()));
            }
        }
    }
