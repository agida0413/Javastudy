// &&직렬 연산자  ||병렬 연산자

//사용처 &&=> 기간이나 범위 안에 포함
//     ||=> 기간이나 범위가 아닌경우


/*
 * 
 *  &&,||는 효율적인 연산을 수행한다
 *  && = > false이면 뒤에 있는 조건은 수행하지않는다.
 *  || = > true 이면 뒤에 있는 조건은 수행하지않는다.
 * 
 * 
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int a=10; int b=9;
		 * 
		 * 
		 * boolean bCheck =a<b && ++b==a; //효율적 연산을 위해 &&뒤에 연산을 수행하지않아 ++b가 수행되지않았다.
		 * System.out.println(bCheck); System.out.println(b);
		 * 
		 * 
		 * boolean cCheck =a<b || ++b==a; System.out.println(cCheck);
		 * System.out.println(b);
		 */
		
		
		int a=10;
		int b=21;
		
		boolean bCheck= (a%2==0) && (b%2!=0);
		
		System.out.println(bCheck);
		
		
	}

}
