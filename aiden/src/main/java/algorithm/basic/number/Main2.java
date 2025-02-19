package algorithm.basic.number;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String students = sc.nextLine();
        System.out.println(main.solution(n, students));
    }

    public int solution(int number, String students){
        String[] studentArr = students.split(" ");
        int tallestStudent = Integer.parseInt(studentArr[0]);
        int answer = 1;
        for (int i = 0; i < number; i++){
            int target = Integer.parseInt(studentArr[i]);
            if (tallestStudent < target) {
                answer++;
                tallestStudent = target;
            }
        }
        return answer;
    }
}
