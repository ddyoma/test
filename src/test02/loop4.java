package test02;

public class loop4 {
	public static void main(String[] args) {

		int num1 = 1;
		for (; num1 <= 9; num1++) {
			System.out.println("====" + num1 + "단 ====");
			for (int num2 = 1; num2 < 10; num2++) {
				System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
			}

		}
		// 아주 완벽한 구구단이 나오는거

		// 선언부 조건부 증감부

		int num11 = 1;
		int num22 = 1;

		for (; num11 <= 9; num11++) {
			System.out.println("====" + num11 + "단 ====");
			for (; num22 < 10; num22++) {
				System.out.println(num11 + "x" + num22 + "=" + num11 * num22);
			}
// 이상한구구단, 1단밖에 안나오는 이유는 두번째for문에서 num22가 10이 되었을때 탈문하는데,
			// 첫번째for문에서 다시 반복하여 두번째 포문이 되었을때 num22가 10이 이미 넘은상태니 안찍힘
		}//완벽한 구구단에서 오류가 없었던것은 두번째 for문 들어갈때마다 num2가 초기화돼서임.
// for 문을 사용해 9단부터 시작하는 구구단을 만들어오기
	} //구구단을 출력하는 클래스를 만들어오기.
}