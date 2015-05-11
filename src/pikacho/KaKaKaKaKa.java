package pikacho;

public class KaKaKaKaKa {

	public static void main(String[] args) {
		String[] family = { "돼지 아빠", "아픈 엄마", "잠꾸러기 누나", "멋진 주한" };
		int i = 0;
		while (i < family.length) {
			if (i % 2 == 1) {
				chuchu(family[i], 1);
			}
			i = i + 1;
		}
	}

	static void chuchu(String j, int h) {
		while (h > 0) {
			System.out.println(h + ":" + j);
			h = h - 1;
		}
	}

}
