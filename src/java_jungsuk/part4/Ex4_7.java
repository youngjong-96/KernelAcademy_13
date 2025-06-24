package src.java_jungsuk.part4;
import java.util.Scanner;

public class Ex4_7 {
    //컴퓨터랑 가위바위보 하기
        public static void main(String[] args) {
            System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요: ");

            Scanner scanner=new Scanner(System.in);
            int player= scanner.nextInt();
            int com=(int)(Math.random()*3)+1;

            switch (player){
                case 1:
                    System.out.println("당신이 선택한 것은 가위입니다.");
                    break;
                case 2:
                    System.out.println("당신이 선택한 것은 바위입니다.");
                    break;
                case 3:
                    System.out.println("당신이 선택한 것은 보입니다.");
                    break;
            }

            switch (com){
                case 1:
                    System.out.println("컴퓨터가 선택한 것은 가위입니다.");
                    break;
                case 2:
                    System.out.println("컴퓨터가 선택한 것은 바위입니다.");
                    break;
                case 3:
                    System.out.println("컴퓨터가 선택한 것은 보입니다.");
                    break;
            }

            switch (player-com){
                case 0:
                    System.out.println("비겼습니다.");
                    break;
                case -2:
                case 1:
                    System.out.println("당신이 이겼습니다.");
                    break;
                case -1:
                case 2:
                    System.out.println("컴퓨터가 이겼습니다.");
            }//switch문의 끝
        }//main의 끝
    }
