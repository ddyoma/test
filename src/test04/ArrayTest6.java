package test04;

public class ArrayTest6 {

	public static void main(String[] args) {
		String[] menus = new String[3];

		menus[0] = "아이스크림";
		menus[1] = "치킨";
		menus[2] = "피자";

		menus = new String[3];
//맥주를 추가할때

		menus[0] = "아이스크림";
		menus[1] = "치킨";
		menus[2] = "피자";

		System.out.println(menus[0]);
		// 이렇게 라마라마늘리기 번거로움.,.\\

		String[] tmpMenus = menus;
		// 이렇게하면 menus배열의 값을 저장해줌.

		menus = new String[4];
//새로운 배열그룹만들기, tmpMenus는 저장되어있다.

		for (int i = 0; i < tmpMenus.length; i++) {
			menus[i] = tmpMenus[i];
			//새로정한4칸짜리 menus에 tmpMenus를 대입
		}
		menus[3] = "맥주";
		//tmpMenus에는 [3]번방이 없으니 추가.
		//[3]번방을 이렇게 초기화 안할시 [3]번방자리는 null로 출력됨.

		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		//
	}

}
