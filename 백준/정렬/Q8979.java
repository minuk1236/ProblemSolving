import java.util.*;

class Country implements Comparable<Country> {
	private int index;
	private int gold;
	private int silver;
	private int bronze;
	private int rank;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Country(int index, int gold, int silver, int bronze) {
		this.index = index;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}

	public int getGold() {
		return gold;
	}

	public int getSilver() {
		return silver;
	}

	public int getBronze() {
		return bronze;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public int compareTo(Country o) {
		if (this.gold == o.gold && this.silver == o.silver) {
			return Integer.compare(o.bronze, this.bronze);
		}

		if (this.gold == o.gold) {
			return Integer.compare(o.silver, this.silver);
		}

		return Integer.compare(o.gold, this.gold);
	}
}

public class Q8979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Country> countries = new ArrayList<Country>();

		for (int i = 0; i < n; i++) {
			int index = sc.nextInt();
			int gold = sc.nextInt();
			int silver = sc.nextInt();
			int bronze = sc.nextInt();

			countries.add(new Country(index, gold, silver, bronze));
		}

		Collections.sort(countries);

		countries.get(0).setRank(1);

		int ans = 1;

		for (int i = 1; i < countries.size(); i++) {
			Country prev = countries.get(i - 1);

			if (prev.getGold() == countries.get(i).getGold() && prev.getSilver() == countries.get(i).getSilver()
					&& prev.getBronze() == countries.get(i).getBronze()) {
				countries.get(i).setRank(prev.getRank());
			} else {
				countries.get(i).setRank(i + 1);
			}

			if (countries.get(i).getIndex() == k) {
				ans = countries.get(i).getRank();
				break;
			}

		}

		System.out.println(ans);
	}

}
