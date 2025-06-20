package fc.java.part2;

import java.util.*;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str=scan.nextLine();
        System.out.println("입력한 문자열은: "+ str);

        scan.nextLine(); //버퍼 비우기(스트림 비우기)

        scan.close(); //키보드 연결 종료
    }
}
