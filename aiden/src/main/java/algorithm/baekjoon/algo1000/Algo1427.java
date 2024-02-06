package algorithm.baekjoon.algo1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Algo1427 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String input = br.readLine();

		char[] inputToCharArr = input.toCharArray();
		Arrays.sort(inputToCharArr);

		for (int i = 1; i <= inputToCharArr.length; i++) {
			System.out.print(inputToCharArr[inputToCharArr.length - i]);
		}
	}
}
