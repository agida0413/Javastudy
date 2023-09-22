import java.util.Scanner;
public class 문제3 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학년을 입력하세요 : ");
		int grade = scan.nextInt();
		if (grade>4 || grade<1) {
			System.out.println("잘못입력하셨습니다.");
			
		}
		System.out.print("점수를 입력하세요:");
		int score = scan.nextInt();
		if (score<0 || score>100) {
			System.out.println("경고!");
			
		}
		
		if (grade==4) {
			if(score>=70) {
				
			System.out.println(score+"이므로 합격");	
			
			}
			else {
				System.out.println(score+"이므로 불합격");	
				
			}
			
		}
		
		if (grade>=1 && grade<4) {
			if (score>=60) {
				
				System.out.println(score+"이므로 합격");	
				
			}
			else {
				System.out.println(score+"이므로 불합격");	
			}
			
		}
	}

}
