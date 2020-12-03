package test03;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[] nums = new int[5];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;

		int e = 10;
		e = (e + 10);

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 10;
			System.out.println(nums[i]);
			//10~50까지를 출력하고싶을때 쓰는 방법
		}
		//System.out.println(nums.length);를 하면 방갯수 출력해줌.

	}
}
