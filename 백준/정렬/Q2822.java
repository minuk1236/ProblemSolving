import java.util.*;

class Quiz implements Comparable<Quiz> {
	private int score;
	private int index;

	public Quiz(int score, int index) {
		this.score = score;
		this.index = index;
	}

	public int getScore() {
		return score;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public int compareTo(Quiz o) {
		if (this.score > o.score) {
			return -1;
		}
		return 1;
	}
}

public class Q2822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Quiz> quizes = new ArrayList<Quiz>();
		for (int i = 1; i < 9; i++) {
			quizes.add(new Quiz(sc.nextInt(), i));
		}

		Collections.sort(quizes);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += quizes.get(i).getScore();
		}
		System.out.println(sum);

		int[] index = new int[5];

		for (int i = 0; i < 5; i++) {
			index[i] = quizes.get(i).getIndex();
		}
		Arrays.sort(index);

		for (int i = 0; i < 5; i++) {
			System.out.print(index[i] + " ");
		}

	}

}
