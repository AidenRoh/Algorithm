package algorithm.basic.string;

import java.util.Scanner;

/**
 * 설명
 *<P>
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 *<P>
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *<P>
 * 단 반복횟수가 1인 경우 생략합니다.
 *<P>
 * 입력
 *<P>
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *<P>
 * 출력
 *<P>
 * 첫 줄에 압축된 문자열을 출력한다.
 *<P>
 * input) KKHSSSSSSSE / output) K2HS7E
 */
public class Main11 {
    public static void main(String[] args){
        Main11 main = new Main11();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(main.solution(input));
    }

    public String solution(String input){
        String index = "";
        int repeat = 1;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < input.length(); i++){
            String each = input.charAt(i) + "";
            if (!each.equals(index)) {
                if (repeat != 1) answer.append(repeat);
                repeat = 1;
                index = each;
                answer.append(index);
                continue;
            }
            repeat++;
            if (i == input.length() - 1) answer.append(repeat);
        }
        return answer.toString();
    }
}
