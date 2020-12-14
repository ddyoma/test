package test05;

public class DataType {
	public static void main(String[] args) {

		/* [원시형 데이터타입]
		 * 숫자
		 * -정수 : int
		 * -실수 : double
		 * 문자
		 * -char
		 * 논리
		 * -불린
		 * 
		 * 
		 */
		System.out.println(3/2);
		//1.5가아닌 1이 나옴. 인트/인트는 인트기 때문.
		System.out.println(3.0/2);
		//1.5가 나옴, 더블이 인트보다 큰 데이터이기 때문.
		double d1 = 2;
		double d2 = 3;
		System.out.println(d2/d1);
		//1.5가 나옴 인트/인트지만 더블로 표현되기 때문.
		//똑같은 문제지만 데이터타입이 다르니 결과가 다르다.
		
	
	
	}

}
