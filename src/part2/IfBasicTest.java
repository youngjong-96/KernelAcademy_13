package fc.java.part2;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //정수 1개를 입력받아 입력된 수가 7의 배수인지 출력하세요.
        System.out.print("정수를 입력하세요: ");
        int a = scan.nextInt();

        if(a%7==0){
          System.out.println(a+"은 7의 배수입니다.");
        }

        //나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하세요.
        System.out.print("나이를 입력하세요: ");
        int age = scan.nextInt();

        if(age>=19){
            System.out.println("성인입니다.");
        }
    }
}