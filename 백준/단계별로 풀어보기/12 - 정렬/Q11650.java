import java.util.*;

class Point implements Comparable<Point> {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int compareTo(Point o) {
		if (this.x == o.x) {
			return Integer.compare(this.y, o.y);
		}

		return Integer.compare(this.x, o.x);
	}
}

public class Q11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Point> points = new ArrayList<Point>();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			points.add(new Point(x, y));
		}

		Collections.sort(points);

		for (Point p : points) {
			System.out.println(p.getX() + " " + p.getY());
		}

	}

}
