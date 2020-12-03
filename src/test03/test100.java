package test03;

public class test100 {
	public static void main(String[] args) {

		int[] nums = new int[5];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;

		for (int i = 0; i < nums.length; i++) {

			System.out.println(i + "번방 =" + nums[i]);

		}
		//프린트에서 i는 for문에 int로 범위가 정해져있고 +문장+ int가아닌 배열을 불러오기하면됨.

	}
}