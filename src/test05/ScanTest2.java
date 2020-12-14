package test05;

import java.util.Scanner;

public class ScanTest2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 학년과 반 이름 응용.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("학년:");
		String str = scan.nextLine();
		int grade = Integer.parseInt(str);
		//인티저를 써서 정수grede로 만들기
		if (grade >= 1 && grade <= 3) {
			//&&말고 ||도 사용가능
			System.out.println(" ");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.print("반:");

		String strs = scan.nextLine();
		int clazz = Integer.parseInt(strs);
		if (clazz >= 1 && clazz <= 10) {
			System.out.println(" ");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.print("이름:");
		String name = scan.nextLine();

		if (grade >= 1 && grade <= 3)
		if (clazz >= 1 && clazz <= 10)
		{System.out.println(grade + "학년" + clazz + "반" + name + "님 반갑습니다.");
	}else{System.out.println("잘못입력하셨습니다.");};
	}
}
