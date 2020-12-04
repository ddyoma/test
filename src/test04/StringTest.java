package test04;

public class StringTest {
	public static void main(String[] args) {

		String str = "가나다라마바사";

		System.out.println(str.length());
		// 길이의 총?
		System.out.println(str.indexOf("가"));
		// 몇번째단어?
		System.out.println(str.substring(3));
		// 단어 시작점 지정해서 프린트,
		/*
		 * substring은 String데이터다.
		 * 
		 */
		System.out.println(str.substring(7));
		// 이론상으로는 에러가 떠야하는데 빈공간나옴.
		// end of file라는 것으로 파일의 끝맺음
		// 7번째는 글자는 아니지만 끚맺음이 있는것으로 인식.

		System.out.println(str.substring(0, 2));
		/*
		 * 가나가 나옴. 시작점과 자르는곳. 굳이쓰는이유는 데이터 효율이좋아짐(인덱싱)
		 */

		System.out.println(str.contains("카"));
		/*
		 * 복수의 s가 아님. 동사에s이니 단수. 포함한다 안한다에 따라 참과 거짓나옴
		 */

		System.out.println("============");
		
		System.err.println(str.replace("가나", "우리"));
		/* 가나를 우리로 바꾸기. 우리다라마바사
		 * 출력할때 한번바꾸는거지 변수선언처럼 아예바뀌지않음
		 * 다시프린트하면 똑같이 가나다라마바사나옴!!
		 * */
		System.out.println(str);
		
		
		
		
		
	
		
		
		/*만약 아예바꾸고싶다면.
		 * 이렇게해서 출력하니까 됨.
		 */
		str = str.replace("가나", "우리");
		System.out.println(str);
		
		
		
		
		System.out.println("============");
		
		str = "  하  이  ";
		System.out.println(str);
		System.out.println(str.trim());
		/*문자열 양옆 공백을 자르고 싶을때?? trim써보기.*
		 * trim은 컨테이너처럼 일회용임.
		 * 
		 */
		
		str = str.trim();
		System.out.println(str);

		
	}
}
