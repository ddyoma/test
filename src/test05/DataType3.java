package test05;

import java.util.Random;
//import띄우기. 컨트롤 + 시프트 +o를 누르면생김
public class DataType3 {

	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * 앞에가 대문자면 참조형 데이터타입(래퍼런스)
		 * 앞에가 대문자인건 new Random();를붙여서 초기화해야함.
		 * new String();도 마찬가지
		 * 원시형이 아니라는 뜻.
		 */
		Random ran = new Random();
		//import띄우기해야 에러없어짐
		Random[] rans = new Random[2];
		//배열화했을때
		System.out.println(rans[0]);
		//null이 나옴,rans의 방에 초기화값이 없음.
		//숫자데이터들은 0이 나오겠지만 String,Random은
		//null이 나오는거임. 값이 없다는 뜻.
		
		Random love = new Random();
		System.out.println(love.nextInt(45)+1);
		//1-45까지의 중복없는 랜덤숫자 뽑기.
		//괄호안 46만 적으면 0부터 45가나온다.
		//1~45를 원하기 때문에 괄호밖 +1을 추가한다.

		
		
	}
}
