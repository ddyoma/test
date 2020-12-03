package test03;

public class ArrayTest {

	public static void main(String[] args) {

		// array는 배열, 차례나 순서에 따라 저장하는거, 순서.
		// 한번에 가질수있는 공간을 만들수있다.
		// 넣을 수 있는것만 넣을 수 있다.
		// 무조건 데이터타입이 하나여야 하는게 단점.
		// 방이 몇개있는지를 알려줘야함.
		// 반드시 0부터 시작하도록

		int[] nums = new int[3];
		// 데이터타입 int가 아니다. int를 여러개 가질수 있는 선언.
		// []는 서랍(index), nums는 복수(배열일때 s를 붙인다)
		// new새로만든다, 뒤에int로 방 몇개만들지 숫자쓰기(초기화) 즉 ,숫자세개 저장가능

		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		// 방세개 만들어서 123은 방번호 매기기
		// 0번에 뭐있나 1번에 뭐있나..

		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		// 1 2 3 나올거임(시간걸리는방법)
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println(nums[i]);
		}
		// 123 나오게하는 두번째방법, for를 이용해 간단하게 할수있음
		// for으로 0부터 2까지 1씩커지는 변수i를 적용하고, nums[i]로 대입
		// 방 갯수가 늘어나 nums[3], nums[4]가 생기면 for문 수정이 필요한 단점.
		
		for (int e = 0; e <nums.length; e++) {
			System.out.println(nums[e]);
		}
		// 더 간단하게 123 출력하는 방법, nums.length로 배열의 길이,범위를 출력한다.
		// 방 갯수가 늘어나도 괜찮다. 
		
		
	}
}
