package baseball;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baseball {
	static int[] computer(){
		List<Integer> v = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		Collections.shuffle(v);
//		System.out.println(v);
		int[] j = new int[3];
		j[0] = v.get(0);
		j[1] = v.get(1);
		j[2] = v.get(2);
		int o = 0;
		while(o < j.length){
//			System.out.println(j[o]);
			o = o + 1;
		}
		return j;
	}

	static int strike(int[] c, int[] j) {
		int h = 0;
		int o = 0;
		while (h < c.length) {
			int k = c[h];
			int d = j[h];
			if (k == d) {
				System.out.println("스트라이크가 몇번째인지 안알라줌");
				o = o + 1;
			}
			h = h + 1;
		}
		return o;
	}
	static int ball(int[] c, int[] j) {
		int p = 0;
		int ball = 0;
		while (p < c.length ) {
			int k = c[p];
			int d = 0;
			while (d < j.length){
				int m = j[d];
				if (k == m && p != d){
					ball = ball + 1;
				}
				
				d = d + 1;
			}
			p = p + 1;
		}
		return ball;
	}
	
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] c = computer();
		int h = 0;
		while(true) {
			System.out.println("내 값이 뭐게? ");
			String line = scanner.nextLine(); // 1,2,9
			if("stop".equals(line)) {
				break;
			}
			System.out.println(line);
			String[] j = line.split(" ");// int a = Integer.parseInt("3");
			if (j.length != 3) {
				continue;
			}
			int[] p = new int [3];  
			p[0] = Integer.parseInt(j[0]);
			p[1] = Integer.parseInt(j[1]);
			p[2] = Integer.parseInt(j[2]);
			int s = strike(c,p);
			int b = ball(c,p);
			System.out.println( " 스트라이크 " + s + " 볼 " + b);
			if(s==3){
				System.out.println(" 당신은 " + (h + 1) + " 번만에 성공 헀어요");
				break;
			}
			h = h + 1;
				
		}
	}

	// public static void main(String[] args) {
	// int[] computer = { 4, 5, 3};
	// int[] joohan = { 2, 9, 3 };
	// int j = 0;
	// while (j < computer.length) {
	// int o = computer[j];
	// int h = joohan[j];
	// if (o == h) {
	// System.out.println( (j + 1) + "번째자리는 스트라이크");
	// }
	// j = j + 1;
	// }
	// }

}
