package algorithm.basic.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args){
        Main4 main = new Main4();
        Scanner sc = new Scanner(System.in);
        //int number = Integer.parseInt(sc.nextLine());
        int number = sc.nextInt();
        /*
        //it is another way to solve using my way
        String[] strArray = new String[number];
        for(int i = 0; i < number; i++){
            strArray[i] = sc.next();
        }
        for (String each : strArray) {
            String answer = main.solution(each);
            System.out.println(answer);
        }
         */
        for (int i = 0; i < number; i++) {
            String answer = main.solution(sc.nextLine());
            System.out.println(answer);
        }
        /*
        //another way to solve
        String[] strArray = new String[number];
        for(int i = 0; i < number; i++){
            strArray[i] = sc.next();
        }
        for (String each : main.solution2(number, strArray)){
            System.out.println(each);
        }
         */
    }

    public String solution(String source){
        String[] split = source.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length -1; i >= 0; i--){
            sb.append(split[i]);
        }
        return sb.toString();
    }

    public ArrayList<String> solution2(int n , String[] sourceArray){
        ArrayList<String> answer = new ArrayList<>();
        for (String s : answer) {
            String tmp = new StringBuilder(s)
                    .reverse()
                    .toString();
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solution3(int n , String[] sourceArray){
        ArrayList<String> answer = new ArrayList<>();
        for (String s : answer) {
            char[] chArray = s.toCharArray();
            int lt = 0, rt = s.length() - 1;
            while (lt < rt) {
                char tmp = chArray[lt];
                chArray[lt] = chArray[rt];
                chArray[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(chArray);
            answer.add(tmp);
        }
        return answer;
    }
}
