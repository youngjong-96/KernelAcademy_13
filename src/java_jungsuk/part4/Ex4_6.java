package src.java_jungsuk.part4;
import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("현재 월을 입력하세요: ");
        int month= scanner.nextInt(); //월 입력받기

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("현재 계절은 겨울입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;
            default:
                System.out.println("현재 계절은 가을입니다.");
        }//switch문의 끝
    }//main의 끝
}
