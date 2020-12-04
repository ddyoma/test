package test04;

public class ArrayTest3 {
	public static void main(String[] args) 
{
		


int[] nums = new int[3];

//nums는 int를 넣을 수 있는 공간이지 int가 아니다.
//nums[0] = int값 , 여기서 0은 int 가아니다.★매우중요
///nums[2] = 52일때 , nums의 2번째방의 값이52인거다.
//배열은 모두 0~ 다.



//입력폼
for (int e = 0; e <nums.length; e++) {
	nums[e] = (e+1)*3;
	//nums의[e]번째방의 값이(e+1)*3이랑 같다는 뜻★매우중요
}
	

	
	//출력폼
for(int e=0; e<nums.length; e++) 
 {System.out.println(nums[e]);

}


String str;
/* 
 * 
 * 
 * 
 * */



}
}
