package algorithm.basic.number;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args){
        Main11 main = new Main11();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] board = new int[number][5];
        for(int i = 0; i < number; i++){
            for(int j = 0; j < 5; j++){
                board[i][j] = sc.nextInt();
            }
        }
        main.solution(number, board);
    }

    public void solution(int number, int[][] board){
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < number; i++){
            int count = 0;
            for (int j = 0; j < number; j++){
                for (int k = 0; k < 5; k++) {
                    if (board[i][k] == board[j][k]){
                        count++;
                        break;
                    }
                }
            }

            if (count > max){
                max = count;
                maxIndex = i;
            }
        }
        System.out.print(maxIndex + 1);
    }
}
