import java.util.Scanner;
public class 문자열7 {
public static void main(String[] args) {
	final String MID="admin",MPWD="1234";
	
	Scanner scan =new Scanner(System.in);
	System.out.println("아이디 입력 : ");
	String check_id = scan.next();
	System.out.println("비밀번호 입력: ");
	String check_pw = scan.next();
	
	
		
		
	if (check_id.equalsIgnoreCase(MID)&&check_pw.equalsIgnoreCase(MPWD)) {
		System.out.println("로그인 성공");
		
	}
	else {
	
		System.out.println("로그인 실패");
;
	}
	
}
}
