package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        //정수 1개를 입력 받아 짝수인지 홀수인지 판단하는 프로그램을 만드세요.
        System.out.print("정수를 입력하세요: ");
        int a=scan.nextInt();
        if(a%2==0){
            System.out.println(a+"은 짝수입니다.");
        }else{
            System.out.println(a+"은 홀수입니다.");
        }

        //입력받은 수가 12의 배수인지를 출력하는 코드를 작성하세요.
        if(a%12==0){
            System.out.println(a+"은 12의 배수입니다.");
        }else{
            System.out.println(a+"은 12의 배수가 아닙니다.");
        }

        //년도를 입력 받아서 해당 년도가 윤년인지(4의 배수이면서 100의 배수가 아닌 해이거나 400의 배수인 해) 판단하는 코드를 작성하세요.
        System.out.print("년도를 입력하세요: ");
        int year=scan.nextInt();
        if(((year%4==0)&&(year%100!=0))||year%400==0){
            System.out.println(year+"년은 윤년입니다.");
        }else{
            System.out.println(year+"년은 윤년이 아닙니다.");
        }
    }
}
