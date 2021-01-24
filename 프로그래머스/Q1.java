import java.util.*;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<>();

		int len = speeds.length;
		for (int i = 0; i < len; i++) {
			int num = 100 - progresses[i]; // 진도 100과의 차이
			int temp = 0;
			// 며칠 걸리는지 파악
			if (num % speeds[i] != 0) {
				temp = num / speeds[i] + 1;
			} else {
				temp = num / speeds[i];
			}
			q.offer(temp);
		}

		ArrayList<Integer> result = new ArrayList<>();
		int count = 0;

		// 큐에서 첫번재 요소 미리 뺌
		int prev = q.poll();
		count += 1;

		while (!q.isEmpty()) {
			int a = q.poll();
			if (a <= prev) { // 이전 값보다 작으면 이미 완료된 상태니까 count + 1
				count += 1;
			} else { // 이전 값보다 크면 더 오래 걸린거니까 지금까지 갯수 샌거 넣고 새롭게 시작
				result.add(count);
				count = 1;
				prev = a;
			}

		}
		result.add(count);

		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}

		return answer;
	}
}