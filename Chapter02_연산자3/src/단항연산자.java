//증감 연산자 , 부정연산자  ,형변환 연산자
import java.util.Scanner;
//1개의 정수를 입력받아서 한개를 증가한 값을 출력하시오
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력 : ");
		int a = scan.nextInt();
		
		System.out.println("더하기 전 값 :" + a);
		a+=10;
		System.out.println("더한 후 값 :"  + a );
		int b = a++;
		System.out.println(b);
		System.out.println(a);
		
		
		System.out.println("=========부정연산자========");
		boolean bCheck = true;
		System.out.println(bCheck);
		System.out.println(!bCheck);
	}

}
