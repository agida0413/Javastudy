/*
 *  break: 반복중단
 * 			게임=>esc (반복문, switch)
 * continue :특정부분을 제외
 * 	--------------------------반복문에서만 사용가능
 * ***제어 영역 -->자신의 반복문
 * for() 
 * {		
 * 		outer: for() {
 * 			
 * 			 break outer; =====>2차for문만 제어
 * 			}
 * 	
 *  	break;===>1차for문 제어
 *		}
 * 
 * 
 */
public class 제어문_반복제어문1 {
	public static void main(String[] args) {
			for(int i=1;i<=10;i++) {
				if (i==3) {
					continue;//=>증가식으로 이동
					
				}
				
				
			}
		
		/*for
		 * while
		 * ---break는동일
		 * continue
		 * ---------
		 * 		for->증가식
		 * 		while->조건식
		 * 
		 * -----------무한루프가 될수있다
		 * 			-->처음부터 다시실행할 경우 주로
		 * 
		 * 
		 * 
		 */
			
			int i=1;
			while(i<=10) {
				
				if (i==3) {
					continue;//==>조건식으로 이동
					
					
				}
				System.out.println("i="+i);
				i++;
				
			}
				
			
	}

}
