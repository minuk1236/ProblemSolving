import java.io.*;
import java.util.*;

public class Q1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			hs.add(br.readLine());
		}

		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if (hs.contains(str)) {
				result.add(str);
			}
		}

		Collections.sort(result);

		StringBuilder sb = new StringBuilder();

		sb.append(result.size() + "\n");

		for (String s : result) {
			sb.append(s + "\n");
		}

		System.out.println(sb.toString());
		br.close();
	}

}
