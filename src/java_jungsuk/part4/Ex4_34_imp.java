package src.java_jungsuk.part4;

import java.util.Scanner;
//사용자에게 메뉴 선택 받아서 수량만큼 가격 계산하기

//음식 클래스 생성
class Food {
    int count=0; //주문갯수
    int price; //가격
    String name; //이름

    Food(int count, int price, String name){
        this.count=count;
        this.price=price;
        this.name=name;
    }
}

public class Ex4_34_imp {
    //음식 4개 객체 생성하고 초기화
    static Food[] foods = {
            new Food(0, 10000, "돈가스"),
            new Food(0, 7500, "햄버거"),
            new Food(0, 4500, "김밥"),
            new Food(0, 8000, "닭강정")
    };
    //사용자 선택을 받을 옵션과 최종 금액을 저장할 변수 선언
    static int sum=0;

    //show 매서드: 현재 주문상황을 보여줌
    static void show(){
        for (int i=0;i<foods.length;i++){
            System.out.printf("%s: %d개 \n",foods[i].name,foods[i].count);
        }
        System.out.printf("총 주문금액: %d\n",sum);
        System.out.println();
    }
    //calc 매서드: 주문 메뉴에 따라 수량을 저장하고 금액 추가
    static void calc(int opt, int c){
        foods[opt].count += c;
        sum += foods[opt].price*c;
    }

    //menu 매서드: 선택한 메뉴 보여주고 옵션 보여주기
    static void menu(int opt){
        System.out.printf("%s를 선택하셨습니다. 구매수량을 입력하세요 (1~97): \n", foods[opt].name);
        System.out.println("(뒤로가기: 99, 현재까지 합계보기: 98)");
    }
    //input 매서드: 옵션 입력받기

//main 매서드 시작
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("(1)돈가스");
            System.out.println("(2)햄버거");
            System.out.println("(3)김밥");
            System.out.println("(4)닭강정");
            System.out.print("메뉴를 선택하세요(100을 입력 시 종료): ");

            String s1= scanner.nextLine();
            int opt =Integer.parseInt(s1);

            //입력 허용 범위 외에 입력 방지
            if(opt==0)
            {
                System.out.println("종료");
                show();
                break;
            } else if (!((1<= opt)&&(opt <=4)))
            {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            } else if ((1<= opt)&&(opt <=4)) {
                menu(opt-1);
                String s2=scanner.nextLine();
                int opt2=Integer.parseInt(s2);
                if (opt2==99){
                    //break;
                } else if (opt2==98) {
                    show();
                } else if ((1<=opt2)&&(opt2<=97)) {
                    calc(opt-1,opt2);
                    show();
                    continue;
                }else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
        }//main while 문의 끝
    }//main 문의 끝
}
