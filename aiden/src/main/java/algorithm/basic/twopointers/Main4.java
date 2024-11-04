package algorithm.basic.twopointers;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args){
        Main4 main = new Main4();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        main.solution(a, b, arr);
    }

    public void solution(int a, int b, int[] arr){
        int answer = 0, lt = 0, cnt = 0;
        for (int rt = 0; rt < a; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > b) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        System.out.print(answer);
    }
}
