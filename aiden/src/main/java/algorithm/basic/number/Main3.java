package algorithm.basic.number;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Main3 main = new Main3();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        main.solution(number, a, b);
    }

    public void solution(int number, String a, String b){
        String[] aArr = a.split(" ");
        String[] bArr = b.split(" ");
        for (int i = 0; i < number; i++){
            int aValue = Integer.parseInt(aArr[i]);
            int bValue = Integer.parseInt(bArr[i]);
            if (aValue > bValue) System.out.println(aValue - bValue == 1 ? "A" : "B");
            if (aValue < bValue) System.out.println(bValue - aValue == 1 ? "B" : "A");
            if (aValue == bValue) System.out.println("D");
        }
    }
}
