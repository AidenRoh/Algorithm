package algorithm.basic.number;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args){
        Main1 main = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String numbers = sc.nextLine();
        System.out.println(main.solution(n, numbers));
    }
    public String solution(int n, String numbers){
        int startNumber = Integer.parseInt(numbers.charAt(0) + "");
        String[] values = numbers.split(" ");
        String answer = String.valueOf(startNumber);
        for (int i = 0; i < n; i++){
            if (startNumber < Integer.parseInt(values[i])) {
                answer += " " + values[i];
            }
            startNumber = Integer.parseInt(values[i]);
        }
        return answer;
    }
}
