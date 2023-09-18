//12,1,2 - > 겨울 , 3,4,5 => 봄 . 6,7,8 -여름 > 9,10,11->가을
//case 값이 동일할 수  없다
//case 값에 실수를 사용할 수 없다
// case 값: 
//case 문장을 수행하고 종료시에는 반드시  - >break
//case에 사용하는 순서는 상관이 없다
public class 선택문_3 {
public static void main(String[] args) {
	
	int a= (int)(Math.random()*12)+1;
	
	switch(a){
	case 12:
	case 1 : 
	case 2 :System.out.println(a+"는겨울입니다.");
	break;
	
	case 3:
	case 4 : 
	case 5 :System.out.println(a+"는봄입니다.");
	break;
		
	case 6:
	case 7 : 
	case 8 :System.out.println(a+"는여름입니다.");
	break;
	
	case 9:
	case 10 : 
	case 11 :System.out.println(a+"는가을입니다.");
	break;
		
		
	
	}
	
}
}
