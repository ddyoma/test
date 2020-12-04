package test04;

public class ArrayTest5 {

	public static void main(String[] args) {
		String[] strs = new String[3];

		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";

		System.out.println(strs[0].indexOf("토"));
		// -1나옴
		
		
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].indexOf("이") != -1) {
			} else {
				System.out.println(strs[i]);

				// 거북이만 출력하기.
				// 이를 포함하는 문자라면 출력되고
				// 이를 포함하지않을때는 -1 이 출력된다.
				// 이점을 이용해 -1이 나올때는 아무것도안하고{} 아니면프린트한다.

			}//글자길이를 알고싶을때 length

			
		}

	}}

