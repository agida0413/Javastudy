/*
 * 		문자열
 * 	
 * 		문자 ' ' = > 한글자 저장=>char
 * 			'a' , 'b', 'c'==> 한번 저장이 가능 String =>""
 * 		일반 데이터형
 * 		String name="홍길동"; ==>제어 
 * 		클래스형
 * 		기능=>메소드 
 * 		=>웹은 데이터형이 존재하지 않는다 = > 문자열 
 * 		"1" 
 * 	
 *  
 * 
 * 
 */
import java.util.Scanner;
public class 문자열1 {
	public static void main(String[] args) {
		String str="홍길동";
		//저장
		Scanner scan = new Scanner(System.in);
				System.out.println("검색어 : ");
				String findData = scan.next();
				System.out.println(findData);
		
		
	}
	

}
