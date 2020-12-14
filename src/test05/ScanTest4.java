package test05;

import java.util.Scanner;

public class ScanTest4 {

	public static void main(String[] args) {
//계산기 만들기.
		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 숫자:");
		String numStr1 = s.nextLine();
		int first = Integer.parseInt(numStr1);
		System.out.print("두번째 숫자:");
		String numStr2 = s.nextLine();
		int two = Integer.parseInt(numStr2);
		System.out.print("연산자:");
		String operator = s.nextLine();
		if (operator.contentEquals("+")) {
			// contentEquals는 스캔한 내용이 +와 동일하냐고 묻는것,Equals도 맞음.
			// +라는 문자를입력했을때 first와 two를 더하게끔 만든다.
			System.out.print(first += two);
		}
		if (operator.contentEquals("-")) {
			System.out.print(first -= two);
		} // -라는 문자를 입력하는경우 뺄셈.

		if (operator.contentEquals("*")) {
			System.out.print(first * two);
		}
		if (operator.contentEquals("/")) {
			System.out.print(first / two);
		}
		if (operator.contentEquals("%")) {
			System.out.print(first % two);
		}

	}
}
