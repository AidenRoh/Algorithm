package algorithm.basic.hash;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Collections;

public class Main5 {
    public static void main(String[] args){
        Main5 main = new Main5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(main.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr){
        int answer = -1;
        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    tree.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        int cnt = 0;
        for (int each : tree){
            cnt++;
            if (cnt == m) return each;
        }
        return answer;
    }
}