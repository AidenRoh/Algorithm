package algorithm.basic.hash;

import java.util.Scanner;
import java.util.HashMap;

public class Main1 {
    public static void main(String[] args){
        Main1 main = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        main.solution(n, str);
    }

    public void solution(int n, String str){
        char[] votes = str.toCharArray();
        int max = 0;
        char answer = 'a';

        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i = 0; i < 5; i++){
            hash.put((char)(65 + i), 0);
        }

        for (char each : votes) {
            if (each == 'A') hash.put(each, hash.getOrDefault(each, 0) + 1);
            if (each == 'B') hash.put(each, hash.getOrDefault(each, 0) + 1);
            if (each == 'C') hash.put(each, hash.getOrDefault(each, 0) + 1);
            if (each == 'D') hash.put(each, hash.getOrDefault(each, 0) + 1);
            if (each == 'E') hash.put(each, hash.getOrDefault(each, 0) + 1);
        }

        for(int i = 0; i < 5; i++){
            int a = hash.get((char)(65 + i));
            if (a > max){
                max = a;
                answer = (char)(65 + i);
            }
        }

        System.out.print(answer);
    }

    public void solution2(int n, String str){
        char answer = Character.UNASSIGNED;
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> hash = new HashMap<>();
        for (char each : str.toCharArray()) {
            hash.put(each, hash.getOrDefault(each, 0) + 1);
        }

        for (char each : hash.keySet()) {
            if (hash.get(each) > max) {
                max = hash.get(each);
                answer = each;
            }
        }
        System.out.println(answer);
    }
}
