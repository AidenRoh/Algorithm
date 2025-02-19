package algorithm.basic.twopointers;

import java.util.Scanner;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args){
        Main1 main = new Main1();
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int[] firstArr = new int[first];
        for (int i = 0; i < first; i++){
            firstArr[i] = sc.nextInt();
        }
        int second = sc.nextInt();
        int[] secondArr = new int[second];
        for (int i = 0; i < second; i++){
            secondArr[i] = sc.nextInt();
        }
        main.solution(first, second, firstArr, secondArr);
    }

    public void solution(int first, int second, int[] firstArr, int[]secondArr){
        int[] answer = new int[first + second];
        int firstInput = first;
        int secondInput = second;
        int index = 0;

        for (int i = 0; i < first + second; i++){
            if (!(firstInput == 0)){
                answer[index] = firstArr[firstInput - 1];
                firstInput--;
                index++;
            }

            if (!(secondInput == 0)){
                answer[index] = secondArr[secondInput - 1];
                secondInput--;
                index++;
            }

            if (index == first + second) break;
        }

        Arrays.stream(answer).sorted().forEach(each -> System.out.print(each + " "));
    }
}