package test03;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char[] chars = new char[5];
		// 이걸로한다면 안,녕,하,세,요 한글자씩 하고 for문써서 출력해야함.

		chars = new char[6];
		// 밑에 또 나오면 위에 5짜리랑 초기화시킨것들 전부 없어짐,,, 새로운6개방으로 해야함.

		
		System.out.println("============");
		
		
		
		String str = "안녕하세요녕";
		System.out.println(str);

		// 문자열은간단...
		// 안 녕 하 세 요는 char의 집합체임.

		
		
		System.out.println(str.indexOf("안"));
		// 저기서 안 이라는 글자가 몇번째인지 방인지 알고싶을때....답은 0나옴 char[0]자리니까

		System.out.println(str.indexOf("하"));
		
		System.out.println(str.indexOf("요"));

		System.out.println(str.indexOf("녕"));
		// 앞에 녕만 보고 뒤의 녕은 안보는거.

		System.out.println(str.indexOf("안녕"));
		// 안이 0에서 일치하기때문에 0만 출력

		System.out.println(str.indexOf("안하"));
		// 배열에서 가장작은숫자는0인데 아무것도 만족하지 않아서 나올수 없는 -1나옴
		// indexOf가 -1일때.

		
		
		String search = "안녕";
		
		
		if (str.indexOf(search) == -1) {
			System.out.println("없어");
		}else {System.out.println("있어");
		//java에서.은 000~의000 시스템의 out에 출력해.라는 메소드를 실행한것.
		//out은 기울어져있음, 이텔리체.
		//str과 search둘다 안녕이 있으니 '있어'가 나옴.
		//소문자인데 ()가 있으면 함수다. println(),main() 등등 전부 함수, 즉 매소드다.

		// method메소드 =함수 =function펑션
		//객체지향 프로그래밍(OOP)중에 하나가 Java
		}

	}
}
