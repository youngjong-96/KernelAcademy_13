package src.java_jungsuk;

public class Operator {
    public static void main(String[] args) {
        // i++ 과 ++i의 차이
        int i=3, j=5;
        System.out.println(j+ i++);
        System.out.println(i);
        System.out.println(j+ ++i);

        //정수형 1234는 float형 보다 작아서 자동형변환 가능
        float f=1234;
        System.out.println(f);

        //char형은 거의 int형과 함께 생각
        System.out.println((int)'가');
        System.out.println((int)'다');
        System.out.println('다'-'가');

        //int 형의 범위를 넘어가서 a*b는 오버플로우 발생 -> long형으로 형변환 필요
        int a=1_000_000;
        int b=2_000_000;
        System.out.println(a*b);
        System.out.println((long)a*b);

        //Math.round(): 실수를 소수 첫번째 자리에서 반올림해서 정수 반환
        double pi=3.141592;
        System.out.println(Math.round(pi*1000)/1000.0); //3.142
        System.out.println((int)(pi*1000)/1000.0); //3.141

        //문자열 비교   -> 문자열 비교 시에는 == 연산자 보다는 equals()매서드 사용
        String str1="abc";
        String str2="abc";
        String str3=new String("abc");
        String str4=new String("abc");
        System.out.println(str1==str2);  //True
        System.out.println(str1.equals(str2));  //True
        System.out.println(str3==str4);  //False
        System.out.println(str3.equals(str4));  //True

        //논리 연산자 &&, ||
        int num=24;
        System.out.println(num%2==0 || num%3==0); //True //num은 2의 배수이거나 3의 배수이다
        System.out.println(num%7==0 || num%3==0 && num%6!=0);  //False  //num은 7의 배수이거나 3의배수이면서 6의 배수가 아니다.  //&&연산자가 ||보다 우선한다
        System.out.println('0'<='5' && '5'<='9');  //True //임의의 문자('5')는 숫자0~9 사이에 있다
        System.out.println('a'<='h' && 'h'<='z');  //True //'h'가 소문자인지 확인
        System.out.println(!('a'<='h' && 'h'<='z')); //False //'h'가 소문자가 아니다

        //조건연산자 ? :
        System.out.println(3>5?3:5); //5 //참이면 3, 거짓이면 5

        //문자인 숫자를 숫자로 변환하기
        char char1='2';
        char char2='0';
        System.out.println((int)char1+10); //그냥 int로 변환하면 해당 유니코드 번호로 변환
        System.out.println(char1-char2+10); //문자 '0'을 빼면 됨!
    }
}
