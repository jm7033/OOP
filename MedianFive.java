package hello;

//➢ 양수 5개를 입력 받아 배열에 저장하고, 가운데 값을 출력하는 프로그램을 작성하시오.
//➢ MedianFive.java
//➢ 배열을 사용

import java.util.Scanner;

public class MedianFive {

	public static void main(String[] args) {
		int[] arr = new int[5]; //입력받은 정수를 저장할 배열 5개 만들기
        Scanner scanner = new Scanner(System.in); 

        for (int i = 0; i < 5; i++) { //5번 반복
            System.out.print("양수를 입력하세요: "); //양수 입력
            int num = scanner.nextInt(); //입력받기
            if (num < 0) { //음수이면 다시 입력받기
                System.out.println("양수를 입력해주세요.");
                i--; //음수이면 i증가 x
            } else {
                arr[i] = num; //배열에 양수 저장
            }
        }

        System.out.println("가운데 값: " + arr[2]); //가운데 값은 2번째 인덱스
		
        scanner.close();
	}

}