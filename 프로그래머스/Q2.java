import java.util.*;

/*
 * 2021 KAKAO BLIND RECRUITMENT - 신규 아이디 추천
 * */

public class Q2 {

	public static void main(String[] args) {

		System.out.println(new Solution().solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(new Solution().solution("z-+.^."));
		System.out.println(new Solution().solution("=.="));
		System.out.println(new Solution().solution("123_.def"));
		System.out.println(new Solution().solution("abcdefghijklmn.p"));
		System.out.println(new Solution().solution("...abc..."));
	}

}

class Solution {
	public String solution(String new_id) {
		String answer = "";
		Deque<Character> dq = new LinkedList<>();
		Deque<Character> newDq = new LinkedList<>();

		// 1. 모든 대문자를 소문자로 치환
		String str = new_id.toLowerCase();

		// 2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('a' <= c && c <= 'z') {
				dq.offer(c);
			} else if ('0' <= c && c <= '9') {
				dq.offer(c);
			} else if (c == '-' || c == '_' || c == '.') {
				dq.offer(c);
			}
		}

		// 3. 마침표(.)가 2번 이상 연속되면 하나로 치환
		char prev = dq.poll();
		newDq.offer(prev);
		while (!dq.isEmpty()) {
			char ch = dq.poll();
			if (ch == '.' && ch == prev) {
				continue;
			} else {
				newDq.offer(ch);
			}
			prev = ch;
		}

		// 4. 마침표가 처음이나 끝에 위치한다면 제거

		if (newDq.size() == 1) {
			if (newDq.peekFirst() == '.') {
				newDq.pollFirst();
			}

		} else if (newDq.size() > 1) {
			if (newDq.peekFirst() == '.') {
				newDq.pollFirst();
			}
			if (newDq.peekLast() == '.') {
				newDq.pollLast();
			}
		}

		// 5. 빈 문자열이라면 "a"를 대입
		if (newDq.size() == 0) {
			newDq.offer('a');
		}

		// 6. 길이가 16자 이상이면 15개 이후로 제거, 만약 제거후 마침표가 마지막에 있으면 그것도 제거
		if (newDq.size() >= 16) {
			while (newDq.size() != 15) {
				newDq.pollLast();
			}

			if (newDq.peekLast() == '.') {
				newDq.pollLast();
			}
		}

		// 7. 길이가 2자 이하라면 마지막 문자를 길이가 3이 될때가지 끝에 넣기
		if (newDq.size() <= 2) {
			while (newDq.size() != 3) {
				char ch = newDq.peekLast();
				newDq.offer(ch);
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!newDq.isEmpty()) {
			sb.append(newDq.poll());
		}

		answer = sb.toString();

		return answer;
	}
}