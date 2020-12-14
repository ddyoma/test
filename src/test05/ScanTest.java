package test05;

import java.util.Scanner;

//컨트롤시프트o
public class ScanTest {

	public static void main(String[] args) {

		// Scan 입력
		// Input/Output
		// 입력/ 출력 >>I/O
		// 스캐너, 컨트롤시프트o로 오류없애기

		Scanner scan = new Scanner(System.in);
		// 참조형은 반드시 = 아래에있는것 쓰기
		System.out.print("몇 살이니?");
		String str = scan.nextLine();// 엔터칠때까지 기다린다.
		System.out.println("니가쓴글 :" + str);
		
		
		System.out.println("네 나이= " + str);
		int age =Integer.parseInt(str);
		
		 if(age>= 1 &&age<200) {
			System.out.println("정상입력!!");}
		else { System.out.println("제멋대로");}
		 
		 //200이 넘어가면 제멋대로, 정상범위는 정상입력출력!
	}
}
