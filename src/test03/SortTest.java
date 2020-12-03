package test03;

public class SortTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// sort =정렬 , 가격낮은순, 최신순,,,이런거임

		{
			int[] ages = new int[3];

			ages[0] = 10;
			ages[1] = 5;
			ages[2] = 22;

			for (int i = 0; i < ages.length; i++) {
				System.out.println(ages[i]);

			}
			// 일반출력임

			System.out.println("===================");

			// 오름차순으로 정렬해보기.
			int tmp = ages[0];
			// 혹은 int []tmp = ages; 인트는인트 인트배열은 인트
			ages[0] = ages[1];
			ages[1] = tmp;

			for (int i = 0; i < ages.length; i++) {
				System.out.println(ages[i]);

			}
		}

		System.out.println("===================");

		{
			int[] ages = new int[3];

			ages[0] = 10;
			ages[1] = 5;
			ages[2] = 22;

			int tmp = ages[1];

			ages[1] = ages[0];
			ages[0] = ages[2];
			ages[2] = tmp;

			for (int i = 0; i < ages.length; i++) {
				System.out.println(ages[i]);
				// 나같은경우는 tmp에 가장낮은수를 집어넣고 높은수부터 정렬, 이런경우 값이바뀌면 다 이상해짐..
			}

		}
		{
			{
				System.out.println("===================");

				{
					int[] ages = new int[3];

					ages[0] = 10;
					ages[1] = 5;
					ages[2] = 22;

					int tmp = ages[0];
					ages[0] = ages[2];
					// 현재까지 [22, 5, 22]
					ages[2] = tmp;
					// 현재까지 [22, 5, 10]
					tmp = ages[1];
					ages[1] = ages[2];
					// 현재까지 [22, 10, 10]
					ages[2] = tmp;
					// 현재까지 [22, 10, 5]

					for (int i = 0; i < ages.length; i++) {
						System.out.println(ages[i]);
					}
					
				}

			}
		}
	}
}
