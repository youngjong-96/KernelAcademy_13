package fc.java.part3;

import src.pre_study.model.model.BookDAO;
import src.pre_study.model.model.BookDTO;
import java.util.Scanner;

public class BookStudy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //책 권수 입력 받기
        System.out.print("저장할 책 권수를 입력하세요(숫자만 입력): ");
        int count = scan.nextInt();

        //BookDTO에 데이터를 저장하기 위해 배열과 객체 생성하기
        BookDTO[] book = new BookDTO[count];
        BookDAO dao = new BookDAO();
        for (int i = 0; i < book.length; i++) {
            book[i] = new BookDTO();
            //BookDTO에 입력받은 책 권수만큼 데이터 입력하기
            scan.nextLine();
            System.out.print((i + 1) + "번째 책의 제목을 입력하세요: ");
            book[i].title = scan.nextLine();
            System.out.print((i + 1) + "번째 책의 지은이를 입력하세요: ");
            book[i].writer = scan.nextLine();
            System.out.print((i + 1) + "번째 책의 출판사를 입력하세요: ");
            book[i].company = scan.nextLine();
            System.out.print((i + 1) + "번째 책의 페이지수를 입력하세요: ");
            book[i].page = scan.nextInt();
            System.out.print((i + 1) + "번째 책의 가격을 입력하세요: ");
            book[i].price = scan.nextInt();
            dao.BookInsert();
            System.out.println((i+1)+"번째 책 정보:"+book[i].title+"\t"+book[i].writer+"\t"+book[i].company+"\t"+book[i].page+"\t"+book[i].price);
        }
    }
}
