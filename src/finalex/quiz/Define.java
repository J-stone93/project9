package finalex.quiz;


/*
 * 여러 파일에서 공유하는 상수 만들기
 * */
public class Define {  //1.접근범위(public) 2.인스턴스생성없이사용(static) 3.값 변경되면 안됨(final)

	public static final int MIN = 1; //최소값
	public static final int MAX = 999; //최대값
	public static final int ENG = 1001; //영어 과목 코드
	public static final int MATH = 2001; //수학 과목 코드

}
