package hello;

//➢ do-while 문을 이용하여 ‘가’ 부터 ‘힣’까지 출력하는 프로그램을 작성하시오. (유니코드)
//➢ 자음이 바뀌면 변경선 표현 “--…--” (https://www.unicode.org/charts/PDF/UAC00.pdf)



public class KoreanChar {
    public static void main(String[] args) {
        int start = 0xAC00; // '가'의 유니코드 값
        int end = 0xD7A3;   // '힣'의 유니코드 값
        int code = start;
        int prevChosung = -1; //이전 문자의 초성값
        int prevJong = -1; //이전 문자의 종성값

        do {
            System.out.print((char) code);
            //자음인 경우 https://needjarvis.tistory.com/644참고함
            int choSung = ((code - start) / 28) / 21; //초성공식
            int jongSung = (code - start) % 28; //종성공식 

            //이전 문자와 비교해서 값이 다르면 자음(초성,종성)이 바뀐 것이므로 변경선 출력
            if (jongSung == 0 || choSung != prevChosung || jongSung != prevJong) {
                System.out.println("--...--");
            }
            //출력 후에는 이전 문자의 종성값과 초성값에 현재값을 저장
            prevJong = jongSung;
            prevChosung = choSung; 
            code++;
        } while (code <= end);
    }
}






