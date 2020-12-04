package test02;

public class GuGuDan {
	public static void main(String[] args) {
		
		
		int num1 = 2;
		for (; num1 <= 9; num1++) {
			System.out.println("====" + num1 + "단 ====");
			for (int num2 = 1; num2 < 10; num2++) {
				System.out.println(num1 + "x" + num2 + "=" + num1 * num2);
			}

		}//공용홈월크에 올리는법 붙여넣기해서 오류생기면 더블클릭, 라이브러리,
		//어플라이 하기. 상단명에 src.숙제.d20201202.장은선;이런식이면
		//src지우고 저장후 자바껐다키면 오류없어짐.

		
		int num11 = 9;
		for (; num11 >=2; num11--) {
			System.out.println("====" + num11 + "단 ====");
			for (int num2 = 9; num2 > 0; num2
					--) {
				System.out.println(num11 + "x" + num2 + "=" + num11 * num2);
			}

		}//거꾸로 구구단 코드
		
		
		//반복문은 for, while이 있다
		//for에는 (선언부 조건부 증감부)가 있다 
		/*()로 묶여있으나 꼭 ()안에 있을필요는 없다. 다 바깥으로 내보내고
		*for(;;)만 써도 된다 다 밖으로 내보내도됨. 복잡해보이니 굳이 많이 하지는,,,
		*조건부 증감부가 밖으로나올땐if와, 선언부는int와배치한다. 
		**/
		
		
		      // for 
		      //선언부
		      //조건부
		      //증감부
		      for(int i=1;i<=10;i++) {
		         if(i==2) {
		            //i의 값이 2일경우에 continue아래의 문장을 실행하지 않고
		            //for문으로 올라간다.
		            continue;
		         }
		         if(i==5) {
		            //i의 값이 5일경우 현재 돌고 있는 for문을 종료시킨다.
		            break;
		         }
		         System.out.println(i);
		      }
		      
		      for(int i=1;i<10;i++) {
		         if(i%2==0) {
		            System.out.println("i = " + i);
		         }
		      }
//		      int num = 1;
//		      num++;
//		      System.out.println(num++);
//		      System.out.println(num);
		      
		   }
		

}


