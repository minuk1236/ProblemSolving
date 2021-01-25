import java.util.*;

/*
 * 정렬 - K번째수
 * */

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1] - 1;
			int k = commands[i][2] - 1;

			// 임시 배열
			int[] temp = new int[end - start + 1];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = array[start];
				start += 1;
			}

			// 배열 정렬
			Arrays.sort(temp);

			result.add(temp[k]);
		}

		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}

		return answer;
	}
}

public class Q3 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] result = new Solution().solution(array, commands);
		for(int i : result) {
			System.out.print(i+", ");
		}
		

	}

}
