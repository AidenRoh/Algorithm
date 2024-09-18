package algorithm.basic.string;

import java.util.*;

public class Main6 {

    public static void main(String[] args){
        Main6 main = new Main6();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(main.solution2(input));
    }

    public String solution(String input){
        Set<String> answer = new LinkedHashSet<>();
        char[] chArr = input.toCharArray();
        for (char each : chArr) {
            answer.add(each + "");
        }
        return String.join("", answer);
    }
    // join도 결국 for문을 돌리기 때문에 O(n)과정을 두 번하게 된다. 크게 영향은 없겠지만
    // if(answer.add(each+"")){
    //     answer += each;
    // }
    // 를 통해 for 문을 한 번 덜 돌게 만들어도 좋을 것 같다.

    public String solution2(String input){
        List<String> list = new ArrayList<>();
        char[] chArr = input.toCharArray();
        for (char each : chArr) {
            if (!list.contains(each + "")){
                list.add(each + "");
            }
        }
        return String.join("", list);
    }

    public String solution3(String input){
        String answer = "";
        for(int i = 0; i < input.length(); i++){
            if(input.indexOf(input.charAt(i)) == i){
                answer += input.charAt(i);
            }
        }
        return answer;
    }

    public String solution4(String input){
        String answer = "";
        for (char each : input.toCharArray()) {
            if (!answer.contains(String.valueOf(each))) {
                answer += each;
            }
        }
        return answer;
    }

    public String solution5(String input){
        String answer = "";
        char[] chArr = input.toCharArray();
        for (char each : chArr) {
            if (answer.indexOf(each + "") != -1) {
                answer += each;
            }
        }
        return answer;
    }
}
