package hello;
import java.util.Scanner;

public class StringTest {

	public static void main(String a[]) {
		
		String str;
		Scanner sc=new Scanner(System.in);
		
		//for (int i=0; i<5; i++) { //while문으로 바꾸기 전에 안정적으로 for문으로 빠져나가는 것을 확인하였음.
		while(true) {
			System.out.print("문자열을 입력하세요> ");
			str=sc.next();
			if(str.equals("quit")==true) //equals()는 2개의 문자열이 일치하는지를 검사할때 사용한다. String클래스의 메소드
				break;
			if(str.matches("^www\\.(.+)")) { //www.로 시작하는 문자열인지 검사하는 코드. matches()메소드는 문자열이 어떤 문자열을 포함하고 있는지를 검사할 때 사용한다.
				                             //^문자열의 시작을 표시.-->메타문자.  
				System.out.println(str + " 은 'www'로 시작합니다.");
			} else {
				System.out.println(str + " 은 'www'로 시작하지 않습니다.");
			}
		}
		sc.close();
	}

}
