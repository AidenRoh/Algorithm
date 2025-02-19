package algorithm.basic.twopointers;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args){
        Main2 main = new Main2();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] aArr = new int[a];
        for (int i = 0; i < a; i++){
            aArr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int[] bArr = new int[b];
        for (int i = 0; i < b; i++){
            bArr[i] = sc.nextInt();
        }
        main.solution(a ,aArr, b, bArr);
    }

    public void solution (int a , int[] aArr, int b, int[] bArr){
        List<Integer> answer = new ArrayList<>();
        int Arr1 = 0, Arr2 = 0;
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        while (Arr1 < a && Arr2 < b){
            if (aArr[Arr1] == bArr[Arr2]) {
                answer.add(aArr[Arr1]);
                Arr1++;
                Arr2++;
            }
            else if (aArr[Arr1] < bArr[Arr2]) Arr1++;
            else Arr2++;
        }
        answer.forEach(each -> System.out.print(each + " "));
    }
}
