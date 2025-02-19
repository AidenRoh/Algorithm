package algorithm.basic.number;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args){
        Main12 main = new Main12();
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        int testNumber = sc.nextInt();
        int[][] intArr = new int[testNumber][grade];
        for (int i = 0; i < testNumber; i++){
            for (int j = 0; j < grade; j++){
                intArr[i][j] = sc.nextInt();
            }
        }
        main.solution(grade, testNumber, intArr);
    }

    public void solution(int grade, int testNumber, int[][] intArr){
        int answer = 0;
        // grade also indicates the number of students
        for (int i = 1; i <= grade; i++){
            for (int j = 1; j <= grade; j++){
                int count = 0;
                // considering all number of cases
                for (int k = 0; k < testNumber; k++){
                    int positionI = 0;
                    int positionJ = 0;
                    for (int z = 0; z < grade; z++){
                        if (intArr[k][z] == i) positionI = z;
                        if (intArr[k][z] == j) positionJ = z;
                    }
                    if (positionI < positionJ) count++;
                }
                if (count == testNumber) answer++;
            }
        }
        System.out.print(answer);
    }
}
