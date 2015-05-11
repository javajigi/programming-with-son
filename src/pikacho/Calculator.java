package pikacho;

public class Calculator {
	static long juhan2(long a, long b, long c){
		long d = a * b - c;
		return d;
	}
	
	static int 나누기( int jigi, int pika){
		int joohan = jigi / pika;
		return joohan;
	}
	
	static int 더하기 (int java, int jigi, int pika){
		int joohan = java + jigi / pika;
		return joohan;
	}
	
	public static void main(String[] args) {
		int j = 나누기( 100000, 100);
		System.out.println("나누기 값 : " + j);
		
		int h = 더하기(6, 2, 2);
		System.out.println("더하기 값 : " + h);
		
		long o = juhan2(1927345, 9999, 50);
		System.out.println("juhan이 구한 값 : " + o );
	}
}
