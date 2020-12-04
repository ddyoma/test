package test02;

public class loop5 {
	public static void main(String[] args) {

		// 컨티뉴와 브레이크
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		// continue는 지속하되, if절 만족하면 밑에꺼 실행안하고 다시하러올라감 
		// 만족하지 않을때 밑에꺼 실행함.
		// 즉 홀수만 실행하고싶을땐 짝수일때 실행 안하게끔 하는것임

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		//  만족할때 찍히게끔하는것 (컨티뉴안쓰는거)

		
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		// 1부터 10까지는 나오는데 i가 5가 되면 안나옴, 즉
		// 답은 1~4, 6~10나옴. AWT SWiNG JavaFX

		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		// break는 if를 만족하면 포문을 나가버림 만약 i가 5랑같아지면 나가버리는거
	}
}
