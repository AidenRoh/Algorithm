package algorithm.basic.string;

import java.util.Scanner;

public class Main1 {
    /**
     * 1. 문자 찾기
     * 설명
     * <p>
     * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
     * <p>
     * 입력
     * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
     * 문자열은 영어 알파벳으로만 구성되어 있습니다.
     * <p>
     * 출력
     * 첫 줄에 해당 문자의 개수를 출력한다.
     * <p>
     * input)
     * Computercooler
     * c
     * output)
     * 2
     */
    public static void main(String[] args){
        Main1 main = new Main1();
        Scanner in=new Scanner(System.in);
        String source = in.nextLine();
        char target = in.nextLine().charAt(0);
        int result = main.solution(source, target);
        System.out.println(result);
    }

    public int solution(String source, char target){
        int count = 0;
        String str = source.toLowerCase();
        char ch = Character.toLowerCase(target);
/*
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) count++;
        }
*/
        for (char c : str.toCharArray()){
            if (c == ch) count++;
        }
        return count;
    }
}
