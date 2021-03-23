import java.util.*;

public class Q10870 {
	public static int n;

	public static int fib(int x) {
		if (x == 0 || x == 1) {
			return x;
		}

		return fib(x - 1) + fib(x - 2);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		System.out.println(fib(n));

	}

}
