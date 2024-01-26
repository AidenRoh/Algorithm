package algorithm.baekjoon.algo1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int inputValue = Integer.valueOf(bf.readLine());
		bf.close();

		//몇 번째 대각선인지 찾기
		int lineNumber = 0;
		int numberOfMember = 0;
		while (inputValue > numberOfMember) {
			lineNumber++;
			numberOfMember += lineNumber;
		}

		findLocation(lineNumber, numberOfMember, inputValue);
	}

	private static void findLocation(int lineNumber, int numberOfMember, int inputValue) {
		int lineOrder = inputValue - (numberOfMember - lineNumber);

		if (lineNumber % 2 == 0) {
			System.out.println(lineOrder + "/" + (lineNumber - lineOrder + 1));
		} else {
			System.out.println((lineNumber - lineOrder + 1) + "/" + lineOrder);
		}
	}
}
