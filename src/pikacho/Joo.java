package pikacho;

public class Joo {
	public static void main(String[] args) {
//		double sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13  ;
//		System.out.println(sum);
		
		int 합 = 0;
		int 기준점 = 0;
		while ( 기준점 < 8 + 10287) {
			기준점 = 기준점 + 1;
			System.out.println(기준점);
			합 = 합 + 기준점;
			System.out.println(합);
		}
		System.out.println(합);
	}
}
