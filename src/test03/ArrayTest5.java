package test03;

public class ArrayTest5 {
	public static void main(String[] args) {

		// 콘켓연산자(연결연산자)

		// 문자+숫자 출력하면 연결연산자로 정의되어 뒤에도 연결되어나올뿐 계산은 안됨.

		// 문자열 참조형데이터타입String을 활용한 배열
		String[] strs = new String[5];
		strs[0] = "1";
		strs[1] = "2";
		strs[2] = "3";
		strs[3] = "4";
		strs[4] = "5";

		for ( int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		//1부터 5까지 정상출력됨
		
		for (int e = 0; e < strs.length; e++) {
			strs[e] = (strs[e] + 1);
			System.out.println(strs[e]);
		
		}
		
		//변형해본것. int라면 strs[e] = (strs[e] + 1);줄에서 덧셈이 되겠지만 strs는 문자열데이터배열이기 때문에 덧셈은안됨.
		//strs[e]의 e는 숫자라서 for로 반복증감이 가능하지만, 문자열인게 정체라는것.

	}
}
