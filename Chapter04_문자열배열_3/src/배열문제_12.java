//3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고 국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 출력하는 프로그램을 작성하시오

import java.util.Scanner;

public class 배열문제_12 {
	public static void main(String[] args) {
		int kor[]=new int[3];
		int eng[]=new int[3];
		int math[]=new int[3];
		int total[]=new int[3];
		int rank[]=new int[3];
		rank[0]=1;
		rank[1]=1;
		rank[2]=1;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<kor.length;i++) {
			System.out.print((i+1)+"번째 학생 국어점수입력 : ");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 학생 영어점수입력 : ");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 학생 수학점수입력 : ");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			
		}
		for(int i=0;i<rank.length;i++) {
				for(int j=0;j<rank.length;j++) {
					if (total[i]<total[j]) {
						rank[i]++;
					}
					
					
				}
			
			
		}
		for(int i=0;i<kor.length;i++) {
			System.out.println((i+1)+"번째 학생 총점"+total[i]);
			System.out.println((i+1)+"번째 학생 평균"+(total[i]/(double)kor.length));
			System.out.println((i+1)+"번째 학생 등수"+rank[i]);
			System.out.println("===========================================");
			
			
		}
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for(int i=0;i<math.length;i++) {
			sum1+=kor[i];
			sum2+=math[i];
			sum3+=eng[i];
			
			
		}
		
		System.out.println("국어점수 총점:"+sum1);
		System.out.println("수학점수 총점:"+sum2);
		System.out.println("영어점수 총점:"+sum3);
		
		
		
	}
}
