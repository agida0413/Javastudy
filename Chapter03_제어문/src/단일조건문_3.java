import java.util.Scanner;
public class 단일조건문_3 {
public static void main(String[] args) {

	System.out.print("수를 입력하세요 : ");
	Scanner scan = new Scanner(System.in);
	int i =scan.nextInt();
	
	
	if (i%11==0) {
		System.out.println(i+ "는 같은 수입니다.");
		
	}
	else {
		System.out.println(i + "는 다른 수입니다.");
	}
	
	
}
}
