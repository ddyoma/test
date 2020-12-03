package test01;

public class Condition2 {
	
	public static void main(String[] args) {
		
		int a =101;
		
		
		if (a<100) {System.out.println("a는100보다작다");
		}
		else if(a>100) {System.out.println("a는100보다크다");
		}
		else { System.out.println("a는100이었다");
	//만약에 a가 100보다 작다면 출력, a가 100보다 크다면 출력 , 아니라면 12번째줄 출력
		}
	
	
		int c= 10;
		int b= 110;
	//c도 b도 100보다 작다면,,?
	if  (c<100) {if(b<100) {System.out.println("gg"); }}
	

	
	if(c<100 && b<100) {System.out.println("야호");}
	
	
	if(c<100 && b>100) {System.out.println("와우");
	
	}
	//&는 엔드조건  true&&false 모든조건이 true여야지만 true다
	//|는 or조건
	if(c<100 || b<100) {System.out.println("둘중에 하나라도 성립");}
	
	
	}
	
}
