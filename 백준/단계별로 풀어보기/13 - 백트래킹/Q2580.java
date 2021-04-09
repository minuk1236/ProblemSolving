import java.io.*;

public class Q2580 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] map = new int[9][9];

		for (int i = 0; i < 9; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		backtracking(map, 0, 0);

	}

	public static void backtracking(int[][] map, int x, int y) {

		// 해당 행이 다 채워진 상태라면 다음 행의 0번 열부터진행
		if (y == 9) {
			backtracking(map, x + 1, 0);
			return;
		}

		// 행과 열이 모두 채워지면 출력
		if (x == 9) {
			print(map);
			System.exit(0);
		}

		if (map[x][y] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (check(map, x, y, i)) {
					map[x][y] = i;
					backtracking(map, x, y + 1);
				}
			}
			map[x][y] = 0;
			return;
		}

		backtracking(map, x, y + 1);
	}

	public static boolean check(int[][] map, int x, int y, int value) {

		// 행에 중복된 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (map[x][i] == value) {
				return false;
			}
		}

		// 열에 중복된 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (map[i][y] == value) {
				return false;
			}
		}

		// 3x3 사각형에 중복된 원소가 있는지 검사
		int row = (x / 3) * 3;
		int col = (y / 3) * 3;

		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				if (map[i][j] == value) {
					return false;
				}
			}
		}

		return true;

	}

	public static void print(int[][] map) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
