package test02;

public class loop5 {
	public static void main(String[] args) {

		// ��Ƽ���� �극��ũ
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		// continue�� �����ϵ�, if�� �����ϸ� �ؿ��� ������ϰ� �ٽ��Ϸ��ö� 
		// �������� ������ �ؿ��� ������.
		// �� Ȧ���� �����ϰ������ ¦���϶� ���� ���ϰԲ� �ϴ°���

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		//  �����Ҷ� �����Բ��ϴ°� (��Ƽ���Ⱦ��°�)

		
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		// 1���� 10������ �����µ� i�� 5�� �Ǹ� �ȳ���, ��
		// ���� 1~4, 6~10����. AWT SWiNG JavaFX

		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		// break�� if�� �����ϸ� ������ �������� ���� i�� 5���������� ���������°�
	}
}
