package test01;

public class Condition {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean higher;
		//크다 작다 크거나같다 다르다 같다 등 모두 불린에 저장
		int num1 = 100;
		int num2 = 200;
		higher = num1 > num2;
		System.out.println(higher);
		higher = num1 < num2;
		System.out.println(higher);

		
		
		boolean love;
		int num3 = 200;
		int num4 = 200;
		love = num3 >= num4;
		System.out.println(love);
		love = num3 < num4;
		System.out.println(love);
		
		

		
		int h1 = 2 * 2+10;//14
		h1 = (10+2)*2;//24
		//먼저계산하는건 괄호쓰기
		int h2 = 5/2;
		System.out.println(h2);
		// 5/2 =>2.5가 나오나,int는 실수가 안나옴 ,0.5는 절삭됨. 
		int h3 = 5%2;
		//5나머지2라고 읽으며 답은1  %나머지는 나머지 연산자
	    System.out.println(h3);
	    
	    
	    
		int hour =3;
		if(hour<3) {System.out.println("안녕하세요");}else {System.out.println("안녕히가세요");
		}
		//if(조건문)의 ()안에는 boolean값만들어감, hour값이 3보다 작다면 {}안에있는거 프린트하라는거임
		//else로  그렇지 않다면 뒷값을 내라.
	} 


}



