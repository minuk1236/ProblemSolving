import java.io.*;
import java.util.*;

public class Q11728 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		ArrayList<Integer> al = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			al.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			al.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(al);

		StringBuilder sb = new StringBuilder();
		for (int a : al) {
			sb.append(a + " ");
		}

		System.out.println(sb);
	}

}
