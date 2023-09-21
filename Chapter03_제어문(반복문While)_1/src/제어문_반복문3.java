import java.util.Scanner;
public class 제어문_반복문3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int kor,eng,math;
		int total;
		double avg;
		while(true) {//무한루프
			
			System.out.println("국어점수 입력:");
			kor=scan.nextInt();
			if (kor>0 && kor<=100) {
				
				break;//종료
				}
			

			
			
		}
		
		while(true) {
			System.out.println("영어점수 입력:");
			eng=scan.nextInt();
					if (eng>0 && eng<=100) {
				
				break;//종료
				}
			
		}
		
		while(true) {
			System.out.println("수학점수 입력:");
			math=scan.nextInt();
					if (math>0 && math<=100) {
				
				break;//종료
				}
			
		}
		
		total =kor+eng+math;
		avg=total/3.0;
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f",avg);
		
	}

}
