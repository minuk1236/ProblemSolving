import java.util.*;

/*
 * Summer/Winter Coding(~2018) - 스킬트리
 * */

class Solution {
	public int count;
	public ArrayList<Character> skills = new ArrayList<Character>();
		
	public int solution(String skill, String[] skill_trees) {
		
		// 1. skill 문자를 제외한 나머지 삭제
		// 2. skill 문자열과 같은지 확인
		
		// 선행 스킬
		for(int i=0; i<skill.length(); i++) {
			skills.add(skill.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		// 스킬트리 하나씩 확인
		for(int i=0; i<skill_trees.length; i++) {
			String str = skill_trees[i];
			
			// 하나하나 skills에 포함되어 있는지
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j);
				if(skills.contains(c)) {
					sb.append(c);
				}
			}
			if(skill.indexOf(sb.toString()) == 0) {
				count += 1;
			}
			
			sb.delete(0, sb.length());
		}
		
		return count;
	}
}

public class Q5 {

	public static void main(String[] args) {
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		System.out.println(new Solution().solution("CBD", skill_trees));

	}

}
