//가장 기본이 되는 연산자
/*
 * 산술연산자 : + , - , / ,%
 * 
 * 
 * 
 * 
 */

import javax.print.DocFlavor.BYTE_ARRAY;

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//국어 , 영어 ,수학점수의 총점을 구한다. 
		
		int kor=50;
		int eng=60;
		int math=30;
		
		int total=kor+eng+math;
		double avg= total/3.0;
		//정수 / 정수 는 소수점 절하 이므로 3.0을 나눔
		
		
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" + eng);
		System.out.println("수학 :" + math);
		System.out.println();
		System.out.println("총점 :" + total);
		System.out.println();
		System.out.println("평균 :" + avg);
		System.out.printf("평균 :%.2f",avg);//소수점 두자리 반올림
		System.out.println();
		
		System.out.println("=======%==============");
		
		int a=5;
		int b=2;
		System.out.println(a+"%"+b+"="+(5%2));
		System.out.println(-a+"%"+b+"="+(-5%2));
		System.out.println(a+"%"+-b+"="+(5%-2));
		System.out.println(-a+"%"+-b+"="+(-5%-2));
		// 나눈 나머지의 음, 양 은 앞의 숫자의 부호를 따라간다.
		
		System.out.println("===========형변환===========");
		
		/*
		 * 자동 형변환 - > 작은데이터형  - > 큰데이터형
		 * 강제 형변환 -> 큰데이터형 - > 작은데이터형
		 * (데이터형)값
		 * byte <char < int < long < float < double
		 *   <======강제 형변환
		 * 
		 * 자동형변환 
		 * int a = 'A';
		 *  => a =65
		 *  
		 *  double d =100;
		 *  		---int
		 *  => d=100.0
		 */
		
		
		int aa ='A';
		System.out.println(aa);//자동 형변환
		
		double dd= 100;//자동 형변환
		System.out.println(dd);
		
		System.out.println(100+10.5+10.5f+'A');// 최종 결과값 double
		
		//자동 형변환이 있는경우 -> 연산은 같은 데이터형끼리만 연산
		
		
		System.out.println('A'+'B');//정수형
		//int 이하 계산은 결과값이 int
		
		

	}

}
