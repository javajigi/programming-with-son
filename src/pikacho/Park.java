package pikacho;

public class Park { 
//	int i = 3;
//	if ( i % 2 == 0 ) {
//		System.out.println("짝수");
//	} else {
//		System.out.println("홀수");
//	}	
	
//	int i = 0;
//	while (i < family.length) {
//		if (i % 2 == 1) {
//			chuchu(family[i], 1);
//		}
//		i = i + 1;
//	}
//	static void chuchu(String j, int h) {
//		while (h > 0) {
//			System.out.println(h + ":" + j);
//			h = h - 1;

	public static void main(String[] args) {
		int[] j = { 3, 8, 9, 10, 11, 25 };
		int v = 0;
		int p = 0;
		while (v < j.length) {
			if (v % 2 == 1) {
				joo(j[v], 1);
				p = p + j[v];
			}
			v = v + 1;
		}
		System.out.println( p );
	}
	static void joo(int h, int o) {
		while (o > 0 ) {
			System.out.println( h );
			o = o - 1;
		}
	}

}