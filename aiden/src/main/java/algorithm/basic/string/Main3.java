package algorithm.basic.string;

import java.util.Scanner;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *<p>
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *<p>
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 단어를 답으로 합니다.
 * <p>
 * input) "it is time to study"
 * output) study
 */

public class Main3 {
    public static void main(String[] args){
        Main3 main = new Main3();
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String result = main.solution2(source);
        System.out.println(result);
    }

    public String solution(String source){
        String[] split = source.split(" ");
        String longest = "";
        for (String each : split){
            if (each.length() > longest.length()) longest = each;
        }
        return longest;
    }

    public String solution2(String source){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        String manipulate = source + " ";
        while ((pos = manipulate.indexOf(" ")) != -1) {
            String tmp = manipulate.substring(0, pos);
            if (tmp.length() > answer.length()) answer = tmp;
            manipulate = manipulate.substring(pos + 1);
           /* int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }*/
        }
        return answer;
    }
}