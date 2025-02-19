package algorithm.basic.comparable;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Main1 main = new Main1();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] inputs = new int[number];
        for (int i = 0; i < number; i++){
            inputs[i] = sc.nextInt();
        }
        System.out.print(main.solution(inputs));
    }

    public String solution(int[] array){
        for (int i = 0; i < array.length; i++){
            int index = i;
            for (int j = i+1; j < array.length; j++){
                if (array[index] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[index];
                    array[index] = tmp;
                }
            }
        }
        return Arrays.toString(array);
    }
}