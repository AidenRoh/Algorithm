package algorithm.baekjoon.algo1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo1308 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer current = new StringTokenizer(br.readLine());
		int currentYear = Integer.valueOf(current.nextToken());
		int currentMonth = Integer.valueOf(current.nextToken());
		int currentDay = Integer.valueOf(current.nextToken());

		StringTokenizer end = new StringTokenizer(br.readLine());
		int dYear = Integer.valueOf(end.nextToken());
		int dMonth = Integer.valueOf(end.nextToken());
		int dDay = Integer.valueOf(end.nextToken());

		int currentTotalDays = new Algo1308().calcDays(currentYear, currentMonth, currentDay);
		int endTotalDays = new Algo1308().calcDays(dYear, dMonth, dDay);

		if (currentYear + 1000 < dYear ||
				currentYear + 1000 == dYear && (currentMonth < dMonth || currentMonth == dMonth && currentDay <= dDay)) {
			System.out.println("gg");
		} else {
			System.out.println("D-" + (endTotalDays - currentTotalDays));
		}
	}

	public int calcDays(int year, int month, int day) {
		int[] monthChart = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days = 0;

		for (int i = 1; i < year ; i++) {
			days += 365 + checkYear(i);
		}
		for (int i = 1; i < month; i++) {
			days += monthChart[i];
			if (i == 2) {
				days += checkYear(year);
			}
		}
		return days + day;
	}

	public int checkYear(int year) {
		if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
			return 1;
		}
		return 0;
	}
}
