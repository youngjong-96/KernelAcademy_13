package src.java_jungsuk;

//String 클래스의 다양한 매서드
public class Ex5_14 {
    public static void main(String[] args) {
        String str="ABCDE";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.println("charat["+i+"]:"+ch);
        }

        char[]charArr=str.toCharArray();

        System.out.println(charArr);

        //1. .lenth(): 문자열 길이 반환 (!= .length)
        //2. .charAt(index번호): index 위치에 있는 문자 반환
        //3. .substring(~부터, ~까지): index 번호 위치 ~부터 ~까지 문자열 반환
        //4. .equals("비교문자열"): 비교문자열과 같은지 비교
        //5. .toCharArray(): 문자열을 문자 배열로 변환
    }
}
