package algorithm.baekjoon.algo1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int wordCount = Integer.valueOf(br.readLine());
		String[] data = new String[wordCount];

		//배열에 입력
		for (int i = 0; i < wordCount; i++) {
			data[i] = br.readLine();
		}
		//배열정렬
		String[] sortedData = sortArray(data);
		//중복 제거
		List<String> finalResult = removeDuplicate(sortedData);
		//출력
		for (String each : finalResult) {
			System.out.println(each);
		}
	}

	private static String[] sortArray(String[] target) {
		String[] result = target;
		//단어 길이가 같을 때
		Arrays.sort(target, (o1, o2) -> {
			if (o1.length() == o2.length()) {
				return o1.compareTo(o2); // 사전 순 정렬}
			}
			// 그 외
			return o1.length() - o2.length();
		});

//		Arrays.sort(data, new Comparator<String>() {
//			//단어 길이가 같을 때
//			@Override
//			public int compare(String o1, String o2) {
//				if (o1.length() == o2.length()) {
//					return o1.compareTo(o2); // 사전 순 정렬}
//				}
//				// 그 외
//				return o1.length() - o2.length();
//			}
//		});
		return result;
	}

	private static List<String> removeDuplicate(String[] target) {
		return Arrays.stream(target).distinct().collect(Collectors.toList());
	}
}
