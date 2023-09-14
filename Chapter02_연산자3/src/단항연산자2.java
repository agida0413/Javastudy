
public class 단항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=65;
		double d=(double)a;
		//생략이 가능
		char c = (char)a;
		//특수한 경우 => 생략이 가능 (실제 값 대입)
		//char c =65
		//연산 처리가 되면 생략할수 없다
		
		System.out.println("a = "+a);
		System.out.println("d = "+d);
		System.out.println("c = "+c);
		c=0;
		System.out.println(c);
	}

}
