import java.io.*;
import java.util.*;

public class Q2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			al.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(al);

		for (int i = 0; i < n; i++) {
			bw.write(al.get(i) + "\n");
		}
		bw.flush();

		br.close();
		bw.close();

	}

}
