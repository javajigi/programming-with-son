import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Park {
	static int[] com () {
		List<Integer> nos = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		Collections.shuffle(nos);
		int[] j = new int[3];
		j[0] = nos.get(0); 
		j[1] = nos.get(1); 
		j[2] = nos.get(2); 
		return j;
	}
	
	static int sum(int[] v) {
		int p = 0;
		int k = 0;
		while (p < v.length){
			int j = v[p];
			p = p + 1;
			if(j % 2 == 0){
				k = k + j;
			}
		}
		
		
		return k;
	}
	
	static int strike(int[] com, int[] my) {
		int s = 0;
		for(int j = 0; j < com.length; j++){
			int c = com[j];
			int m = my[j];
			if(c == m ){
				s++;
			}
		}
		return s;
	}
	
	static int ball(int[] com, int[] my) {
		int b = 0;
		for(int j = 0; j < com.length; j++){
			int c = com[j];
			for(int l = 0; l < my.length; l++){
				int m = my[l];
				if(c == m && j != l){
					
					b++;
				}
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		int[] com = {2,5,3};
		int[] my = {2,3,5};
		System.out.println("Strike : " + strike(com, my));
		System.out.println("Ball : " + ball(com, my));
		int[] j = com();
		for(int h = 0; h < j.length; h++) {
			int n = j[h];
			System.out.println(" 컴퓨터가 썩은 값 " + n );
		}
		
//		int h = 0;
//		while(h < j.length ){
//			int n = j[h];
//			System.out.println(" 컴퓨터가 썩은 값 " + n );
//			h++;
//		}
		
	}
}
