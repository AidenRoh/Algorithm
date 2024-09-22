package algorithm.basic.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 설명
 *<P>
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *<P>
 * 입력
 *<P>
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 *<P>
 * 문자열의 길이는 100을 넘지 않는다.
 *<P>
 * 출력
 *<P>
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *<P>
 * input) teachermode e / output) 1 0 1 2 1 0 1 2 2 1 0
 */
public class Main10 {
    public static void main(String[] args){
        Main10 main = new Main10();
        Scanner sc = new Scanner(System.in);
        String firstInput = sc.nextLine();
        String secInput = sc.nextLine();
        System.out.println(main.solution(firstInput, secInput));
    }

    public String solution(String first, String sec){
        //1. target 문자의 위치를 파악한다.
        //2. 각 문자와 target 문자의 거리가 가장 작은 것을 반환한다.
        //3. Stringbuilder에 넣는다.
        List<Integer> locationArr = new ArrayList<>();
        StringJoiner answer = new StringJoiner(" ");
        int shortestDistance = first.length() -1; //maximum distance

        for(int location = 0; location < first.length(); location++) {
            if (first.charAt(location) == sec.charAt(0)) locationArr.add(location);
        }

        for(int i = 0; i < first.length(); i++){
            for (int j = 0; j < locationArr.size(); j++){
                int distance = Math.abs(locationArr.get(j) - i);
                if (distance < shortestDistance) shortestDistance = distance;
            }
            answer.add(String.valueOf(shortestDistance));
            shortestDistance = first.length() -1;
        }
        return answer.toString();

    }

}
