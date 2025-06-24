package fc.java.part2;

import java.util.*;
//파이썬은 input 안에다가 "저자를 입력하세요" 같은거 넣을 수 있는데 자바는 따로따로 넣어야해서 불편하네;;
//키보드 쓴다고 처음에 scanner 구문 넣어주고 또 끝나면 scan.close()해야 하는 것도 구리다...
public class ScannerExam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("제목을 입력하세요: ");
        String title=scan.nextLine();
        System.out.println("제목: "+title);

        System.out.print("가격을 입력하세요: ");
        int price=scan.nextInt();
        System.out.println("가격: "+price);

        scan.nextLine(); //버퍼 비우기

        System.out.print("저자를 입력하세요: ");
        String author=scan.nextLine();
        System.out.println("저자: "+author);

        System.out.print("페이지수를 입력하세요: ");
        int page=scan.nextInt();
        System.out.println("페이지수: "+page);

        scan.close();
    }
}
