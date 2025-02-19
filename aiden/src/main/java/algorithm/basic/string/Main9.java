package algorithm.basic.string;

import java.util.*;

/**
 * 설명
 *<p>
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *<p>
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 *<p>
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *<p>
 * 입력
 *<p>
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *<p>
 * 출력
 *<p>
 * 첫 줄에 자연수를 출력합니다.
 *<p>
 * input) g0en2T0s8eSoft / output) 208
 */
public class Main9 {

    public static void main(String[] args){
        Main9 main = new Main9();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(main.solution(input));
    }

    public int solution(String input){
        String answer = "";
        char[] chArr = input.toCharArray();
        for (char each : chArr){
            if (Character.isDigit(each)) answer += each;
        }
        return Integer.parseInt(answer);
    }

    public int solution2(String input){
        int answer = 0;
        for (char each : input.toCharArray()){
            if (each >= 48 && each <= 57) {
                answer = answer * 10 + (each - 48);
            }
        }
        return answer;
    }


}
