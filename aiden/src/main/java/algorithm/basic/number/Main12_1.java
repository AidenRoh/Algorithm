package algorithm.basic.number;

import java.util.Scanner;

public class Main12_1 {

    public static void main(String[] args) {
        Main12_1 main = new Main12_1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] intArrArr = new int[n][m];
        // 분석
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp = scan.nextInt();
                intArrArr[temp-1][i] = j;
            }
        }
        System.out.println(main.solution(n,m,intArrArr));
    }

    private int solution(int n, int m, int[][] intArrArr) {
        int answer = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean flag = true;
                for(int k=0;k<m;k++){
                    if(intArrArr[i][k] >= intArrArr[j][k]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        return answer;
    }
}
