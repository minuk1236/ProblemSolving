import java.util.*;

class Word implements Comparable<Word> {
	private String word;
	private int len;

	public Word(String word, int len) {
		this.word = word;
		this.len = len;
	}

	public String getWord() {
		return word;
	}

	@Override
	public int compareTo(Word o) {
		if (this.len == o.len) {
			return word.compareTo(o.word);
		}

		return Integer.compare(this.len, o.len);
	}

}

public class Q1181 {
	public static ArrayList<Word> words = new ArrayList<Word>();

	public static boolean check(String word) {
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).getWord().equals(word)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String word = sc.nextLine();
			int len = word.length();
			if (check(word) == false) {
				words.add(new Word(word, len));
			}

		}

		Collections.sort(words);

		for (Word word : words) {
			System.out.println(word.getWord());
		}

	}

}
