package test05;

import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {

		Random r = new Random();

//		System.out.println(r.nextInt(45) + 1);
//		System.out.println(r.nextInt(45) + 1);
//		System.out.println(r.nextInt(45) + 1);
//		System.out.println(r.nextInt(45) + 1);
//		System.out.println(r.nextInt(45) + 1);
//		System.out.println(r.nextInt(45) + 1);
//랜덤숫자 6개 출력하기. 중복숫자가 나올수 있고 번거로움.

		int[] lotto = new int[6];

//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = r.nextInt(45) + 1;
//		} // 입력
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(lotto[i]);
//
//		}
		// 출력

		for (int i = 0; i < lotto.length; i++) {
			int rNum = r.nextInt(5) + 1;
			lotto[i] = rNum;
			//방숫자 0, 1, 2, 3...이 랜덤숫자일때,
			for (int j = i - 1; j >= 0; j--) {
				//j는 방번호빼기 1이다. 
				//방번호빼기 1이 0보다 크거나 같을때
				//j--를하고 for문 나가기
				if (rNum == lotto[j]) {
					i--;

					break;
				}
				

			}
		}
		// 중복제거 할수있는 값.
	}

}
