package test03;

public class SwapTest {

	public static void main(String[] args) {

		{
			{
				int num1 = 2;
				int num2 = 3;

				System.out.println(num1 + "," + num2);
				//평범하게 2,3이나옴.
				
				
				
				// num1의 값을 3으로 , num2의 값을 2로 바꾸고 싶을때.첫번째
				num1 = 3;
				num2 = 2;

				System.out.println(num1 + "," + num2);

			}
		}

		// num1의 값을 3으로 , num2의 값을 2로 바꾸고 싶을때.두번째
		{
			{
				int num1 = 2;
				int num2 = 3;

				int tmp = num1;
				// num1의 값을 tmp가 기억해줌
				num1 = num2;
				// num1의 값으로 num2로바꾸기
				num2 = tmp;
				// num2의 값을 아까 tmp로 바꾸기

				System.out.println(num1 + "," + num2);
			}
		}
	}
}
