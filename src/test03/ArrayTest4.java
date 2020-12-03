package test03;

public class ArrayTest4 {
	public static void main(String[] args) {

		boolean[] bls = new boolean[5];

		bls[0] = true;
		bls[1] = false;
		bls[2] = true;
		bls[3] = false;
		bls[4] = true;
		// boolean배열하기 bls는 boolean이 아닌 boolean배열이다.

		//
		{
			for (int i = 0; i < bls.length; i++) {
				if (i % 2 == 0) {
					bls[i] = true;
				} else {
					bls[i] = false;
				}
				System.out.println(bls[i]);
			}
			// 첫번째방법
			{
				for (int e = 0; e < bls.length; e++) {
					if (bls[e] = e % 2 == 0);
						System.out.println(bls[e]);

					
				}
			}
		}
	}
	// 더간단한거
}
