/*
 * 문자열
 * --------String 기능이 많다
 * 1.문자의 개수 확인 :length()
 * 2.검색
 * 	-----
 * startsWith : 시작하는 문자열이 같을때
 * endswith : 끝나는 문자열이 같을때 - > cookie
 * ***contains : 포함
 * 	-----------------추천
 * ***equals : 같은값 =>id,pw
 * 	  ------대소문자 구분
 * 3.문자열 제어
 * 	==변경 :replace(), replaceAll()
 * 	==replace('a','b')
 *  ==replaceAll("[가-힣]","")
 *  ==replaceAll("[0-9-Za-z]","")
 * ==문자 자르기 : subsstring(x)
 * 			   substring(x,y)
 * 						    --->제외
 * ==대문자:toUpperCase()
 * ==소문자:toLowerCase()
 * 
 * 4.모든 데이터형을 문자열로 변경
 * 	=valueOf(1) == > "1"==>윈도우 ,웹=>
 * 5.분리:split() =>String[]
 * 		charAt(index)
 * 	"Hello java" => charAt(0) = > 'H'
 * 	**index번호가 자바는 무조건 0부터 시작(오라클1번)
 * 	
 * 
 * 
 * String =>일반형 = > 
 * ---------------------call by value/call by reference
 * 							|		  -> 배열/클래스 
 * 						  String
 * 
 */
public class 문자열2 {
public static void main(String[] args) {
	String str = "123123123";
	System.out.println(str.length());//문자 갯수 = > 공백포함
	
	if (str.startsWith("123")) {
		
		System.out.println("포함");
		
	}
	else {
		System.out.println("미포함");
	}
	
}
}
