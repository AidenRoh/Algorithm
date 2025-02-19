package algorithm.basic.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void main(String[] args){
        Main1 main = new Main1();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] each = input.toCharArray();
        main.solution(each);
    }

    public void solution(char[] array){
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.size());
        for (char each : array){
            int first = 0;
            int second = 0;
            if (each >= 48 && each <= 57) stack.push(each - 48);
            else {
                second = stack.pop();
                first = stack.pop();
                stack.push(calculate(first, second, each));
            }
        }
        System.out.print(stack.pop());

    }

    private int calculate(int a, int b, char operator){
        if (operator == '+') return a + b;
        if (operator == '-') return a - b;
        if (operator == '*') return a * b;
        if (operator == '/') return a / b;
        return 0;
    }
}
