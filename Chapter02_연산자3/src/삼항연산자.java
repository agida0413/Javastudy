//(조건)?값1:값2
//조건 : true = >값 1
//조건 : false = > 값2
// java.lang.* String, System , Math 
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =(int)(Math.random()*100)+1;
//					------------------	
//						첫번째 계산
		
//				---						--
		            
//			 2번째 계산
//		  								세번째 계산
		
		
		System.out.println((a%2==0)?a+"는 짝수":a+"홀수");
		
		char ch='a';
		char c =(char)((Math.random()*26)+65);
		
		int s=(int)(Math.random()*2);//0,1
		ch=s==0?c:(char)(c+32);
		//'A'+32 =>97 'a'
		System.out.println(ch>='A' && c<='Z'?ch+"는 대문자":c+"는 소문자");
			
	}

}
