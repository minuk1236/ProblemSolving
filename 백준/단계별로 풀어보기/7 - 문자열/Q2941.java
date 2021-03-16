import java.util.*;

public class Q2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.replace("c=", "0");
		str = str.replace("c-", "0");
		str = str.replace("dz=", "0");
		str = str.replace("d-", "0");
		str = str.replace("lj", "0");
		str = str.replace("nj", "0");
		str = str.replace("s=", "0");
		str = str.replace("z=", "0");

		System.out.println(str.length());

	}

}
