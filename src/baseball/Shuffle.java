package baseball;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {
	public static void main(String[] args) {
		List<Integer> v = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		System.out.println(v);
		Collections.shuffle(v);
		System.out.println(v);
		int[] j = new int[3];
		j[0] = v.get(0);
		j[1] = v.get(1);
		j[2] = v.get(2);
		int o = 0;
		while(o < j.length){
			System.out.println(j[o]);
			o = o + 1;
		}
	}
}
