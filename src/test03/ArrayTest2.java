package test03;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] ing = new double[3];
		// decs 방에 double을 넣을수 있다.
		ing[0] = 1.1;
		ing[1] = 2.2;
		ing[2] = 3.3;

		System.out.println(ing);

        //이상태로 출력하면 이상한 형태의 답이나옴

		
		
		double[] decs = new double[3];
		// decs 방에 double을 넣을수 있다. 3의 길이의 방.
		decs[0] = 1.1;
		decs[1] = 2.2;
		decs[2] = 3.3;

		for (int e = 0; e < decs.length; e++) {
	    System.out.println(decs[e]);
        //decs안에 있는 0,1,2는 int기 때문에 int로 정의내림.
	    //같거나 작을때(안됨) 3번방번호가 없기때문에.

	    
	    
	  
		}

	}
}
