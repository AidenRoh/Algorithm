package algorithm.basic.hash;

import java.util.Scanner;
import java.util.HashMap;

public class Main4 {
    public static void main(String[] args){
        Main4 main = new Main4();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        main.solution(str1, str2);
    }

    private void solution(String str1, String str2){
        int answer = 0, lt = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> anagram = new HashMap<>();
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = str2.toCharArray();

        for (int i = 0; i < str2.length(); i++){
            map.put(arrStr1[i], map.getOrDefault(arrStr1[i], 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++){
            anagram.put(arrStr2[i], anagram.getOrDefault(arrStr2[i], 0)  + 1);
        }

        answer += checkLogic(map, anagram);

        for (int rt = str2.length(); rt < str1.length(); rt++){
            if (map.get(arrStr1[lt]) == 1) map.remove(arrStr1[lt]);
            else map.replace(arrStr1[lt], map.get(arrStr1[lt]) - 1);
            lt++;
            map.put(arrStr1[rt], map.getOrDefault(arrStr1[rt], 0) + 1);
            answer += checkLogic(map, anagram);
        }

        System.out.print(answer);
    }

    private int checkLogic(HashMap<Character, Integer> map, HashMap<Character, Integer> anagram){
        int cnt = 0;
        for (char each : anagram.keySet()) {
            if (map.get(each) == anagram.get(each)) cnt++;
        }
        return cnt == anagram.size() ? 1 : 0;
    }
}