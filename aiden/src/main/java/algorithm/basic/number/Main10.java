package algorithm.basic.number;

import java.util.Arrays;
import java.util.Scanner;

public class Main10{
    public static void main(String[] args){
        Main10 main = new Main10();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] board = new int[number+2][number+2];
        for(int i = 1; i <= number; i++){
            for (int j = 1; j <= number; j++){
                board[i][j] = sc.nextInt();
            }
        }
        main.solution(number, board);
    }

    public void solution(int number, int[][]board){
        int count = 0;
        int[] around = new int[4];
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                int target = board[i][j];
                around[0] = board[i-1][j];
                around[1] = board[i+1][j];
                around[2] = board[i][j-1];
                around[3] = board[i][j+1];
                Arrays.sort(around);
                if (around[3] < target) count++;
            }
        }
        System.out.print(count);
    }
}
