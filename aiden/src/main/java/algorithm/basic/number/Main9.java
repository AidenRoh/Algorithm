package algorithm.basic.number;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {

    public static void main(String[] args){
        Main9 main = new Main9();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] board = new int[number][number];
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                board[i][j] = sc.nextInt();
            }
        }
        main.solution2(number, board);
    }

    public void solution(int number, int[][]board){
        int total = 0;
        int biggest = 0;

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                total += board[i][j];
            }
            if (biggest < total) biggest = total;
            total = 0;
        }

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                total += board[j][i];
            }
            if (biggest < total) biggest = total;
            total = 0;
        }

        for (int i = 0; i < number; i++){
            total += board[i][i];
            if (i == number - 1){
                if (biggest < total) biggest = total;
                total = 0;
            }
        }

        for (int i = 0; i <= number; i++){
            total += board[i][number - 1 - i];
            if (i == 0){
                if (biggest < total) biggest = total;
                total = 0;
            }
        }

        System.out.print(biggest);
    }

    public void solution2(int number, int[][]board){
        int biggestVertical = 0;
        int biggestHorizontal = 0;
        int crossLtoR = 0;
        int crossRtoL = 0;
        for (int i = 0; i < number; i++){
            int vertical = 0;
            int horizontal = 0;
            for (int j = 0; j < number; j++){
                vertical += board[i][j];
                horizontal += board[j][i];
            }
            if (biggestVertical < vertical) biggestVertical = vertical;
            if (biggestHorizontal < horizontal) biggestHorizontal = horizontal;
            crossLtoR += board[i][i];
            crossRtoL += board[i][number - 1 - i];
        }

        int[] total = {biggestVertical, biggestHorizontal, crossLtoR, crossRtoL};
        Arrays.sort(total);
        System.out.print(total[3]);
    }
}
