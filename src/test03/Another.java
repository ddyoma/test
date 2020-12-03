package test03;

public class Another {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			for (; i <= 10; i++) {
			}
      //첫번째for문 프린트i로 1나옴
		//종속for문 돌아야하는데 {}에 아무것도 없어서 출력값없이 돌다 11에서 나감. 
			//첫번째for문으로 두번째만복할건데 i가 11되어버린거임 출력못함.
			
			
			
			
			int aa = 1;
			int Aa = 1;
			//자바는 대소문자 구분이 되어 변수정의에 괜찮음
		}
	}
}
