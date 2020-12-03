package test03;

public class looptest {

	public static void main(String[] args) {

		// for의 세부분은 반드시 다 써야지만 동작하는게아니다

		for (int i = 0; i <= 2; i++) {
			System.out.println(i);
			{
				for (int f = 0; f <= 2; f++) {
					System.out.println(f);
				}
			}
			// 0은위에프린트 012 밑에프린트 1 위에프린트 012 밑에프린트 2 위에프린트 012밑에프린트 
			// 0 , 012 1, 012 2 , 012
			// 첫for돌고 포문for들어가서 할일다하고 나와서 for돌고 포문돌고
		}

	}
}
