package test04;

public class StringTest2 {
	public static void main(String[] args) {

		String str = "진석,상혁,은선,예린";

		// 스플리터(구분자), 콤마를기준으로 배열을 만들 수 있다?

		String[] names = str.split(",");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}//입력후 출력하기.
		
		
		
		String omg = "샴,코숏,페르시안,사막";
		//이런경우 구분자는 고양이
		String[] love = omg.split("고양이");
		for (int e = 0; e < love.length; e++) {
			System.out.println(love[e]);
		}
	}
}