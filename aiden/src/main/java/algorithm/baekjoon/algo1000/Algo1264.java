package algorithm.baekjoon.algo1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Algo1264 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

        int count;

        Map<Character, Integer> distinguish = new HashMap<>();

        distinguish.put('A',1);
        distinguish.put('I',1);
        distinguish.put('U',1);
        distinguish.put('E',1);
        distinguish.put('O',1);

        while (true) {
            String initSentence = br.readLine().toUpperCase();
            if (initSentence.equals("#")) break;

            count = 0;
            for (int i = 0; i < initSentence.length(); i++)
                if (distinguish.get(initSentence.charAt(i)) != null) count++;
            System.out.println(count);
        }
    }
}