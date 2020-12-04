package test04;

//예약어
public class ArrayTest {
//예약어
	public static void main(String[] args) {

		// 저러한 예약어들은 변수명으로 쓸 수 없다.

		int[] ints = new int[5];


		for (int i = 100; i <= 500; i += 100) {
			System.out.println(i);
		}
		// 100부터 500까지 나오기.

		System.out.println((200 - 100) / 100);
		// 방번호 나오게하기. 원리
		
		
		ints[0] = 100;
		ints[1] = 200;
		ints[2] = 300;
		ints[3] = 400;
		ints[4] = 500;
		
		//int에 대입하는 포문만들기~~~~~
		for (int e = 100; e <=500; e+=100) {
			int idx = e/ 100 -1;
			//0번방구하기
			ints[idx] = e; 
			//0번방에 i넣기
			
		}
			
			//출력하는for문~
			for(int e=0; e<ints.length; e++) {
			System.out.println(e);
		}
	}
}
