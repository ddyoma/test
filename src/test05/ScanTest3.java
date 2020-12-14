package test05;

import java.util.Scanner;

public class ScanTest3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("가장 좋아하는 죽구 선수는 :");
		String player = scan.nextLine();

		// 이름이 비슷하다면,,,?

		String[] names = { "송흥민", "손흔민", "송흥밍", "손날두" };
		// 스트링인경우에는 {}로 대체가능

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals (player)) {

				// false
				System.out.println("손흥민을 검색하신건가요");
			}
		}

		System.out.println("--------------------");
		// ***********************************
		String strs = "1";
		String strs1 = new String("1");
		System.out.println(strs == "1");
		// true가 나온다.
		System.out.println(strs1 == "1");
		// false가 나온다.
		System.out.println(strs.equals(strs1));
		// new String()을 하지않으면 자바가 알아서해버림.
		// new String()을 하게돼면 데이터값이 달라져서 다른거라고 인식함.
		// ==는 결과가같냐는게아닌 데이터가 같냐는 듯.
		// 이퀄을 사용해 밸류가 같냐고를 물으면 트루가 나옴.

		System.out.println("--------------------");
		// ***********************************
		Scanner s = new Scanner(System.in);
		System.out.print("이름:");
		String name = s.nextLine();
		System.out.println(name == "손흥민");
		// false
		System.out.println(name.equals("손흥민"));
		// true

	}

}
