package hello;

//➢ 입력 받은 수가 3의 배수인지 판별하는 프로그램을 작성하시오.
//➢ MultipleOfThree.java

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num=scanner.nextInt(); //숫자를 정수로 입력
		
		if(num%3==0) { //숫자를 3으로 나눴을 때 0으로 떨어지면
			System.out.println(num+"은(는) 3의 배수입니다.");
		}else { //3으로 나눴을 때 나머지가 0이 아니면
			System.out.println(num+"은(는) 3의 배수가 아닙니다.");
		}
		
		scanner.close();

	}

}