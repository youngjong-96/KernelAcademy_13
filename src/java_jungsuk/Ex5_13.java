package src.java_jungsuk;

import java.util.Scanner;

//16진수를 2진수로 변환해서 표현
public class Ex5_13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //사용할 16진수의 갯수 입력 받기
        System.out.print("출력할 16진수의 갯수를 입력하세요> ");
        String counts=scanner.nextLine();
        int count=Integer.parseInt(counts);

        //사용할 16진수 입력 받기
        char[] hex=new char[count];
        for (int i = 0; i < count; i++) {
            System.out.print("16진수를 입력하세요 (0~9, A~F 대문자)> ");
            String input = scanner.nextLine().toUpperCase(); // 대문자로 변환
            if (input.length() != 1 || !"0123456789ABCDEF".contains(input)) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                i--; // 다시 입력 받기 위해 i 감소
                continue;
            }
            hex[i] = input.charAt(0); // 첫 글자만 저장
        }

        //2진수 배열
        String[]binary={"0000","0001","0010","0011",
                        "0100","0101","0110","0111",
                        "1000","1001","1010","1011",
                        "1100","1101","1110","1111"};
        String result="";

        //각 16진수를 2진수로 변환
        for(int i=0;i<hex.length;i++){
            if('0'<hex[i] && hex[i]<'9'){
                result+=binary[hex[i]-'0'];   //char형 계산으로 정수형으로 변환하기
            }else {
                result+=binary[hex[i]-'A'+10];
            }
        }

        //결과출력
        System.out.println("hex:"+new String(hex));  //String은 클래스이므로 println으로 출력시 객체 생성
        System.out.println("binary:"+result);
    }
}