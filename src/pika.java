
public class pika {
//	int[] j = { 3, 8, 9, 10, 11, 25 };
//	int v = 0;
//	int p = 0;
//	while (v < j.length) {
//		if (v % 2 == 1) {
//			joo(j[v], 1);
//			p = p + j[v];
//		}
//		v = v + 1;
//	}
//	System.out.println( p );
//}
//static void joo(int h, int o) {
//	while (o > 0 ) {
//		System.out.println( h );
//		o = o - 1;
//	}

	static void joo(int[]b, int[] a){
		int[] c = b;
		int[] j = a;
		int k = 0;
		int d = 0;
		while (k < c.length) {
			int m = c[k];
			int n = j[k];
			if (m == n) {
				System.out.println((k + 1) + "번째자리가 스트라이크");
				d = d + 1;
			}
			k = k + 1;
		}
	}
	public static void main(String[] args) {
		
		
	}
				
			}
