import java.util.Iterator;
import java.util.Scanner;
public class 문자열3 {
	public static void main(String[] args) {
		//문자열을 입력을 받아서 A,a가 몇개인지 확인
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력");
		String str= scan.next();
		
		int count_a=0;
		int count_upper_a=0;
		for(int i =0;i<str.length();i++) {//length 는 문자 개수 . 따라서 <
			if (str.charAt(i)=='A') {
				count_upper_a++;
				
			}
			if (str.charAt(i)=='a') {
				count_a++;
				
			}
			
			
		}
		
		System.out.println("A의 개수는 "+count_upper_a);
		System.out.println("a의 개수는 "+count_a);
		
		
//		문자열을 입력받아서 대문자는 소문자로 , 소문자는 대문자로 출력
		
		
	
		
	}

}
