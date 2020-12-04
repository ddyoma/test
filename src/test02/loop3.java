package test02;

public class loop3 {
	public static void main(String[] args) {

//    	for(int w=1; w<10; w++) {System.out.println(w);
//		if(w%2==0) {int num = 10;} 
//		else { System.out.println(num):}
//		}
//		// else로 묶였지만 다른 영역이면 인식안됨.
		// 
		
		
		
		for (int w = 1; w <= 10; w++) {
			System.out.println(w);
			for (; w <= 10; w++) {
				System.out.println(w);
			}
		}
	
		// 첫째 for w의 값은1이고 10보다 같거나 작을때까지 ++를하고 이걸 출력하라는 명령
		//
		// 밑에 for에서 w가 10일때까지 결과값을 출력하라는 명령
		// 
		
		
		
		
		int i = 1;
		for (; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
		// for에서 증감연산자가 있어서 다음프린팅때 11이 나옴
		//
		int e = 10;
		for (; e >= 1; e--) {
			System.out.println(e);
		}
		System.out.println(e);
	}
	// for에 e가 1보다 크거나 작다면 점점 1씩빼거라 명령
	// 증감연산자로 다음 프리팅때 결과 0으로 나옴
		

	
}