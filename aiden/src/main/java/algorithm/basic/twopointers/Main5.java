package algorithm.basic.twopointers;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main5 {

    public static void main(String[] args) {
        Main5 main = new Main5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        main.solution(n);
        HashMap<Integer, Integer> map = new HashMap<>();
    }

    private void solution(int n) {
        int answer = 0, lt = 1, sum = 0;
        int m = n / 2 + 1; // 연속된 수열의 합에서 나올 수 있는 최대 숫자
        for (int rt = 1; rt <= m; rt++) {
            sum += rt;
            if (sum == n) answer++;
            while (sum > n) {
                sum -= lt++;
                if (sum == n) answer++;
            }
        }
        System.out.println(answer);
    }

    private void solution2(int n) {
        int answer = 0 , sum = 0;
        int m = n / 2 + 1;

        for (int i = 1; i <= m; i++) {
            sum += i;
            if ((n - sum) % i == 0) answer++;
        }

        System.out.println(answer);
    }

    private void solution3(int n) {
        int answer = 0 , cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        System.out.println(answer);
    }
}
