package test04;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] nums = new int[30];

		// nums[0] = 1;...nums[1] = 2; 이런건 시간이 너무오래걸림.
		// 위에것 대신에 반복패턴을찾아 입력하기
		for (int e = 0; e < nums.length; e++) {
			nums[e] = e + 1;

			System.out.println("=============");

			// 출력만하는 포문(369버전)

			if (nums[e] % 3 == 0) {
				System.out.println("짝");
			} else {
				System.out.println(nums[e]);
			}
		}
//12짝 34짝 56짝 나오게끔함. 위에 입력문이 없었더라면 nums에 입력된 값이없어 전부0이나옴.
	}
}
