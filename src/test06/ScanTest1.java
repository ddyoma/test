package test06;

import java.util.Scanner;
//컨트롤시프트오 눌러서 자바의 유틸에있는 스캐너를 쓴다는거다.

public class ScanTest1 {

	public static void main(String[] args) {

		System.out.println("안녕하세요");
		// out의 println이라는 메소드(함수)를 call(호출)했다
		// "안녕하세요"라는인자값을 넣고 호출했다.
		// 시스템은 입처럼 in,out둘다 가지고있다.

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		// 스트링을 입력해 스캔할거니 앞에 스트링변수 선언.
		// 니가 엔터칠때까지 스캔할거야
		System.out.println(str);

		System.out.println("--------------------");
		// ***********************************

		Scanner scans = new Scanner(System.in);
		System.out.print("첫번째 숫자 :");
		String strs = scan.nextLine();
		System.out.print("연산자 :");
		String strss = scan.nextLine();
		System.out.print("두번째 숫자 :");
		String strsss = scan.nextLine();

		int n1 = Integer.parseInt(strs);
		int n2 = Integer.parseInt(strsss);
		/*
		 * Integer.parseInt는 인티저의 파스를 해서 스트링을 인트로 바꾸어 숫자를 읽게 만든다 첫번째 숫자와 두번째숫자 변수를 숫자로
		 * 읽게끔 만든다.
		 * 
		 */
		if (strss.equals("+"))		/* 연산자 확인작업하기 */ {
			System.out.println(n1 + n2);
		} else if (strss.equals("-")) {
			System.out.println(n1 - n2);
		} else if (strss.equals("*")) {
			System.out.println(n1 * n2);
		} else if (strss.equals("/")) {
			System.out.println(n1 / n2);
		}
	


	}
}
