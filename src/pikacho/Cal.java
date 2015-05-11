package pikacho;

public class Cal {
	static int joo(int a, int b){
		int j = a + b;
		return j;
	}
	
	static int han(int c) {
		int d = c * joo(3, 4);
		return d;
	}
	
	static int park(int d) {
		int e = joo(3, 4) + han(d);
		return e;
	}
	
	public static void main(String[] args) {
		int h = park(3);
		System.out.println("더한 값 : " + h);
	}
}