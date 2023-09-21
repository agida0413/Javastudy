import java.util.Scanner;

public class 문자열6 {
	public static void main(String[] args) {
		
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programming",
				"JQuery And AJAX",
				"Spring And Java"
				
		};
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력:");
		String findData =scan.nextLine();//next 는 공백에서 절하 , nextLine 공백포함 값을 받늗다.
		System.out.println(findData);
		for(int i =0;i<data.length;i++) {
			
			/* if (data[i].startsWith(findData)) */
/*//			/*if( (data[i].endsWith(findData)) ){*/
		if((data[i].contains(findData)))	
				
				{
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
					// TODO: handle exception
				}
				System.out.println(data[i]);
				
			}
			
		}
	}

}
