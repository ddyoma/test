package test03;

public class StringTest2 {

	public static void main(String[] args) {

		String str = "";
		String str2 = " ";
		System.out.println(str);
		// 빈 문자열을 출력해보자. 출력이되니 빈문자열만으로도 값이있다.***
		// 빈문자와 " " ,space는 다른거다.
		// ""는String이라는걸 알려주는 포인트.

		System.out.println(str == str2);
		// 가짜면false가 뜰거임.

		String sky = "{\"안녕\"}";
		System.out.println(sky);
		// {}도 출력가능한데 ""는 그냥 출력못함
		// \를 앞에쓰고 "하면 쌍따옴표도 출력할 수 있따.

		int[] nums = new int[3];
		System.out.println(nums.length);
		// length는 ()가없으니 메소드, 동사가아니다. 즉 속성이다.
		
		System.out.println("=========");
		
		
		String omg = "태정태세문단세";

		System.out.println(omg.length());
		System.out.println("태정태세문단세".length());
		// length()는 ()가 있으니 메소드다. 즉 함수다.
		// 출력하면 태정태세문단세의 7이 나온다. 
		// length()는 int다.
		// 정적데이터타입이미지는 정해지면 변하지 않는다.태정태세문단세 = omg인거다.

	}
}
