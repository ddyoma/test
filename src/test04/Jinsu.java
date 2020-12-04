package test04;

public class Jinsu {
	public static void main(String[] args) {

		// 10진수는 한자리에 1~9까지는 들어가는데 10이되면 넘어감.
		// 9+1 = 10 으로 표기
		// 8진수 7=1 =10
		// 2진수 1+1 = 10
		// 컴퓨터가 알고있는숫자는 즉1과0밖에없다. =bit
		// 0은 양수로저장됨. 음수아니다. 양수는 0부터다.
		// 즉 byte a= 127 ~ -128의 범주안에서 쓴다.

		// 진수는 한자리로 표현해야함.
		// 16진수는 두자리수이기 때문에,
		// 0123456789abcdef
		// 16진수의 f+1 =10. 10진수로바꾸면 16.

		
		
		int[] num = new int[3];
		System.out.println(num[1]);
		
		double[] nums = new double[3];
		System.out.println(nums[1]);
		// 0, 0.0이나옴. 
		//num의 0번 1번...방들에 아무것도 입력해둔게 없어서 자바가 다 0으로 초기화함.
		//이건 숫자데이터값을가진 모든 데이터배열이 똑같이 0으로 초기화된다.
		
		
		boolean[] bls = new boolean[2];
		System.out.println(bls[0]);
		System.out.println(bls[1]);
		// 지능형데이터는 false를 내보냄.
		
		

		String[] love = new String[3];
		System.out.println(love[1]);
		// 문자열데이터는null나옴. 빈문자열은 데이터값이 있고,
		// null은 데이터값이 없다는것.
		
		String omg2 = " ";
		System.out.println(omg2.length());
		//스페이스바도 1로 읽힌다.
		omg2 = null;
		//이런경우 프린트하면 에러뜬다. 없을 무 그 자체인것.
				
	}
}
