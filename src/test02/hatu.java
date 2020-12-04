package test02;

public class hatu {
	public static void main(String[] args) {
		
		      int myAge = 10;
		      //int는 정수
		      double u = 1.5;
		   //double실수
		    /*class �̸��� Camel Case�� ���´�.
		       *public static void main(String[] args){}�ܿ��
		       *������ �ݵ�� ������ Ÿ���� ���� �����Ѵ�.
		       *�������� Camel Case�� �������ϳ� ù���ڴ� �ҹ��ڷ� �ϰŶ�. camel Case
		       */ 
		      // int는 정수만 저장 할수 있음
		      int num = 10;
		      // double은 실수를 저장 할 수 있음.
		      double d = 1.5;
		      // 1. 아무대나 대문자로 시작하지 않는다.
		      // 2. class 이름은 Camel Case로 짓는다.
		      // 3. public static void main(String[] args) 외운다
		      // 4. 변수는 반드시 데이터타입을 같이 선언한다.
		      // 5. 변수명은 Camel Case를 따르긴하나 첫글자는 소문자
		      
		             int i = 7;
		             int j = 5;
		             int sum =  i+j;
		             
		             
		             System.out.println(i);
		             System.out.println(j);
		             //print만 쓰면 같은라인에 나옴
		             //println하면 한칸씩띄어져서 나옴
		             System.out.println(i+j);
		             //더한값 프린트하는 첫번째방법
		             System.out.println(sum);
		             //더한값 프린트하는 두번째방법
		             
		             
		             double dec1 = 1.5;
		             double dec2 = 2.5;
		             double decSum = dec1+dec2;
		             System.out.println(decSum);
		             System.out.println(dec1+dec2);
		             
		             //같은 영역안에서는 변수와 데이터값은 중복될 수 없다. int i  ,  double i (x)
		             
		             System.out.println(1!=2);
		             System.out.println(1==2);
		             boolean smart = true;
		             System.out.println(smart);
		             boolean hi = 1!=2;
		             System.out.println(1!=2);
		             
		             /*논리형 데이터boolean
		               * 자바의 데이터타입은 크게
       * 1. 숫자 저장
       *    1) 정수 저장
       *     1-1) byte
       *     1-2) short
       *     1-3) int
       *     1-4) long
       *    2) 실수 저장
       *     2-1) float
       *     2-2) double
       * 2. 문자 저장 : char
       * 3. 논리 저장 : boolean       
       */
	}}