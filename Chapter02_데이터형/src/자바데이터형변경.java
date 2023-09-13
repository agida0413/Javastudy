
public class 자바데이터형변경 {

	
	public static void main(String[] args) {
		
		int _int = (int)100.99123901;  //int = > 소수점 이하 제거  , double - >int
		System.out.println("_int : "+ _int);
		
		byte _byte = (byte) 300;
		System.out.println("_byte : "+_byte); // 127초과 
			// 44가 나오는 이유 
				//300을 이진법으로 나타냈을때 1 00101100 
				// byte는 8비트이므로 00101100 까지만 출력가능 2^2  + 2^3 + 2^5 = 44
				
		System.out.println(0b00101100); // 44 2진법 ( 0b )
		
		System.out.println(Integer.toBinaryString(300));
	}
}
