package algorithm.basic.number;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args){
        Main7 main = new Main7();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] scoreArr = new int[number];
        for(int i = 0; i < number; i++){
            scoreArr[i] = sc.nextInt();
        }
        main.solution(number, scoreArr);
    }

    public void solution(int number, int[] scoreArr){
        int score = scoreArr[0];
        int bonusScore = score;
        int totalScore = score;
        for(int i = 1; i < number; i++){
            if(score == scoreArr[i]) {
                bonusScore += scoreArr[i];
                totalScore += bonusScore;
            }else {
                totalScore += scoreArr[i];
                score = bonusScore = scoreArr[i];
            }
        }
        System.out.print(totalScore);
    }
}
