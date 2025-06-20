package src.java_jungsuk;

import java.util.Scanner;

//up-down 게임
public class Ex4_28 {
    public static void main(String[] args) {
        int input;
        int answer = (int)((Math.random() * 100 + 1));
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.print("1~100 사이의 정수를 입력하세요.: ");
            input=scanner.nextInt();

            if(input>answer) {
                System.out.println("더 작은 수를 입력하세요: ");
            } else if (input<answer) {
                System.out.println("더 큰 수를 입력하세요: ");
            }
        }while (input!=answer);
        System.out.println("정답입니다!  정답:"+answer);
    }
}
