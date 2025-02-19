package algorithm.basic.string;

import java.util.Scanner;

/**
 * 설명
 *<P>
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *<p>
 * 입력
 *<P>
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *<P>
 * 출력
 *<P>
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *<P>
 * input) a#b!GE*T@S / output) S#T!EG*b@a
 */
public class Main5 {

    public static void main(String[] args){
        Main5 main = new Main5();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = main.solution(input);
        System.out.println(result);
    }

    public String solution(String input){
        int lt = 0, rt = input.length() -1;
        char[] arr = input.toCharArray();
        while(lt < rt){
            if (Character.isAlphabetic(arr[lt]) && Character.isAlphabetic(arr[rt])){
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
            if (!Character.isAlphabetic(arr[lt])) lt++;
            if (!Character.isAlphabetic(arr[rt])) rt--;
        }
        return String.valueOf(arr);
    }

    public String solution2(String input){
        char[] arr = input.toCharArray();
        int lt =0, rt = input.length() -1;
        while(lt < rt){
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if (Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(arr);
    }
}
