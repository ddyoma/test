package test05;

public class DataType2 {

	public static void main(String[] args) {
		
		//프로그래밍은 수학관련 함수와 함께한다
		//java는 Math class를 제공.
		//올림, 반올림, 내림
		//ceil, round, floor

		double d1 = 1.23456789;
		System.out.println(Math.ceil(d1));
		System.out.println(Math.round(d1));
		System.out.println(Math.floor(d1));
		//.은 ~의
		//소문자는 매소드 ()있으면 메소드
		//ceil은 Math의 메소드다.
		//ceil, floor의 데이터타입은 double인데
		//round만 데이터타입long이라서 1로 나옴.

	}
}
