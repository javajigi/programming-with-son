package baseball;

public class Ball {

	public static void main(String[] args) {
		int[] v = new int[10];
//		v[0] = 3;
//		v[4] = 10;
		int i = 0;
		while (i < v.length) {
			v[i] = i;
			System.out.println(v[i] + "" + i);
			i = i + 1;
		}
		int[] o = new int[3];
		o[0] = v[1];
		o[1] = v[3];
		o[2] = v[6];
		int h = 0;
		while (h < o.length) {
			System.out.println(o[h] );
			h = h + 1;
		}
	}

}
