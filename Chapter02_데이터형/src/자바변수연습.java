//국어 , 영어 , 수학 점수를 받아서 총점과 평균을 구하는 프로그램을 작성
public class 자바변수연습 {

	
	public static void main(String[] args) {
		
		/*
		 * int total=0; double everage=0;
		 * 
		 * int korean=90; int english=80; int math=70;
		 */
		
		int korean=40 , english=60 , math=70, total=0;
		double everage=0;
		char grade = 'A';
		total = korean + english + math;
		
		everage  =total/3;
		
		
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("=======================");
		System.out.println("총점 : " + total);
		System.out.println("=======================");
		System.out.println("평균 : " + everage);
		
	}
}
