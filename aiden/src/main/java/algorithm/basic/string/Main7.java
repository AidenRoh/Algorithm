package algorithm.basic.string;

import java.util.Scanner;
/**
 * 설명
 *<p>
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *<p>
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *<p>
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *<p>
 * 입력
 *<p>
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *<p>
 * 출력
 *<p>
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 *<p>
 * input) gooG / output) YES
 */
public class Main7 {
    public static void main(String[] args){
        Main7 main = new Main7();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(main.solution(input));
    }

    public String solution(String input){
        String source = input.toLowerCase();
        int lt = 0, rt = source.length() -1;
        boolean result = true;
        while(lt < rt){
            if (source.charAt(lt) == source.charAt(rt)){
                lt++;
                rt--;
            } else {
                result = false;
                break;
            }
        }
        return result ? "YES" : "NO";
    }

    public String solution2(String input){
        String answer = "YES";
        input = input.toLowerCase();
        int len = input.length();
        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len -i -1)) return "NO";
        }
        return answer;
    }

    public String solution3(String input){
        String answer = "NO";
        String tmp =new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(tmp)) return answer;
        return "NO";
    }
}
