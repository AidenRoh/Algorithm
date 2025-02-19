package algorithm.basic.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args){
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        main.solution(input);
    }

    public void solution(String input){
        char[] array = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < array.length; i++){
            char each = array[i];
            if (each == '(' && each != array[i+1]) {
                answer += stack.size();
                i = i + 1;
                continue;
            }
            if (each == '(' && each == array[i+1]) stack.push(each);
            if (each == ')') {
                answer++;
                stack.pop();
            }
        }
        System.out.print(answer);
    }

    public void solution2(String input){
        Stack<Character> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (input.charAt(i) == '(') answer += stack.size();
                else answer++;
            }
        }
        System.out.print(answer);
    }
}
