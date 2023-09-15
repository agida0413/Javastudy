//알파벳을 받아서 대문자, 소문자 ,숫자 ,다른 문자
	import java.util.Scanner;
public class 단일조건문2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳 입력 : ");
		
		
		System.out.println("알파벳을 입력하세요");
		char c = scan.next().charAt(0);
		
		
		if (c<='Z'&& c>='A') {
			System.out.println("대문자 : "+c);
			
			}
		else if (c>='a' && c<='z') {
			System.out.println("소문자 : "+c);
			
		}
		else if (c>='0' && c<='9') {
			System.out.println("숫자 : "+c);
			
		}
		else {
			System.out.println("기타 :"+ c);
		}
		
		
		
	}
	
	
}
