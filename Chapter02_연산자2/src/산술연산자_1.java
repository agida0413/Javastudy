// % => 배수 ==> 화폐매수 구하기 
public class 산술연산자_1 {
	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
	
		System.out.println("=================================");
		
		
		
		int c=369;
		//백단위 : 3 , 십단위 : 6 , 단 단위 : 9
		int a1 = c/100;
		int a2 = (c%100)/10;
		int a3 = c%10;
		
		
		System.out.println("백단위: "+ a1);
		System.out.println("십단위: "+ a2);
		System.out.println("단단위: " +a3);
		
		
		//4234
		int d= 3123;
		int 천단위 =d/1000;
		int 백단위 = ((d/100)%10);
		int 십단위 = (d/10)%10;
		int 단단위 = d%10;
		
		System.out.println(천단위);
		System.out.println(백단위);
		System.out.println(십단위);
		System.out.println(단단위);
		
		
		
		
		
		
	}

}
