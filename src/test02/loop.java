package test02;

public class loop {
	public static void main(String[] args) {


	int loo = 2;
	
	loo = loo + 1;
	loo += 1;
	loo++;
	//본인에게 1씩더해지는 즈감연산자
	
	
	
	System.out.println(loo++);
	System.out.println(loo);
	//++는 다음출력때 ++된 값을 돌출
	System.out.println(++loo);
	//++가 앞에있으면 ++된 값을 바로 돌출
	

	
	
	int a = 1;
	String str = "1";
	//인트로 정의내린 숫자와 스트링으로 내린 문자열
	System.out.println(a+str);
	//+를 이용해 11을 만들수있다 숫자 11이 아닌 숫자1과 문자열1
	
	
	System.out.println("i=" +1);
	//방정식만들기
	
	
	for(int i=1; i<10; i++) { System.out.println("i=" +i); }
	//i이라는 변수가 10보다 작고 1씩 커지게끔 반복문 셋팅
	
	
	
	
	int r = 2;
	System.out.println(r%2);
	//2를 2로 나누면 나머지가 0임을 활용
	
	for (int w = 1; w < 10; w++) {
		if (w % 2 == 0) {
			System.out.println("w=" + w);
		}
	}
	
	/*2로나누어서 0이 되는 w만 출력되게끔 설정 (짝수 홀수 출력가능)
	*/
	
	
	
	for(int e=1; e<10; e++) { if(e%2==1) 
	{ System.out.println("e=" +e); }
    /*홀수 응용편
	*/
	}
	}
	
	
}