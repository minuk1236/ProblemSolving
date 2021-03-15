import java.util.*;

public class Q10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int[] ch = new int[26];
		Arrays.fill(ch, -1);

		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a';
			if (ch[index] == -1) {
				ch[index] = i;
			}
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}

	}

}
