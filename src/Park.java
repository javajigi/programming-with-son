
public class Park {
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
		int j = 0;
		int s = 0;
		while(j < com.length){
			int c = com[j];
			int m = my[j];
			if(c == m ){
				s++;
			}
			j++; 
		}
		return s;
	}
	
	static int ball(int[] com, int[] my) {
		int j = 0;
		int b = 0;
		while(j < com.length){
			int c = com[j];
			int l = 0;
			while(l < my.length){
				int m = my[l];
				if(c == m && j != l){
					b++;
				}
				l++;
			}
			j++;
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		int[] com = {2,5,3};
		int[] my = {2,3,5};
		System.out.println("Strike : " + strike(com, my));
		System.out.println("Ball : " + ball(com, my));
	}
}
