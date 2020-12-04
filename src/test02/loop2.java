package test02;

public class loop2 {
	public static void main(String[] args) {
		 {
		 for(int w=2; w<10; w+=2) { if(w%2==0) 
			{ System.out.println("w=" +w); }
		//w = 짝수다.	
		 
		 }
		 int num1 =1;
		 int num2 =1;
       System.out.println(num1 + "X" +num2 + "=" +num1*num2);
		 num2  =2;
	   System.out.println(num1 + "X" +num2 + "=" +num1*num2);
	       num2  =3;
	   System.out.println(num1 + "X" +num2 + "=" +num1*num2);
			 //이렇게 일일히 하는건 힘들다
	       
	   int num3 =1;
		 int num4 =1;
		 for(num4=1; num4<10; num4+=1) {
				System.out.println(num3+ "X" + num4 + "=" + num3*num4 );
			}

		 //한방에 구구단 만들기.
		 
		  
}}}
