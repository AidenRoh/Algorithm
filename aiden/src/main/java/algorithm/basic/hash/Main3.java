package algorithm.basic.hash;
import java.util.Scanner;
import java.util.HashMap;

public class Main3 {
    public static void main(String[] args){
        Main3 main = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        main.solution2(n, m, arr);

    }

    private void solution(int n, int m, int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int lt = 0; lt < m; lt++){
            int rt = lt;
            while (rt < m + lt) {
                map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
                rt++;
            }
            System.out.print(map.size() + " ");
            map.clear();
        }
    }

    private void solution2(int n, int m, int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;

        for (int i = 0; i < m; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(map.size() + " ");

        for (int rt = m; rt < n; rt++){
            if (map.get(arr[lt]) == 1) map.remove(arr[lt]);
            else map.replace(arr[lt], map.get(arr[lt]) -1);
            lt++;
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            System.out.print(map.size() + " ");
        }
    }
}
