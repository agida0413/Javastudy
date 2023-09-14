
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1;
		
		String str = (a%2==0)?"짝수":"홀수";
		
		System.out.println("값 : "+ a);
		System.out.println(str);
		
		
		
		//sex=1,3 , sex=2,4
		
		int b= (int)(Math.random()*4)+1;
		
		String str1 = (b%2==0)?"여자":"남자";
		
		System.out.println("값 : "+ b);
		System.out.println(str1);
		
		

	}

}
