package fc.java.part2;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday 중 하루를 입력하세요.");
        String day=scan.nextLine();

        switch (day){
            case "Sunday" :
                System.out.println("야구하기");
                break;
            case "Monday" :
                System.out.println("농구하기");
                break;
            case "Tuesday" :
            case "Wednesday" :
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
