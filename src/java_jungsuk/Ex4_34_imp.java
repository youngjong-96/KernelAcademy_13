package src.java_jungsuk;

import java.util.Scanner;

//사용자에게 메뉴 선택 받아서 수량만큼 가격 계산하기
public class Ex4_34_imp {
    public static void main(String[] args) {
        int menu=0;
        int sum=0;
        int c1=0, c2=0, c3=0, c4=0;
        int p1=10000, p2=7500, p3=4500, p4=7200;
        Scanner scanner=new Scanner(System.in);

        main:
        while(true)
        {
            System.out.println("(1)돈가스");
            System.out.println("(2)햄버거");
            System.out.println("(3)김밥");
            System.out.println("(4)닭강정");
            System.out.print("메뉴를 선택하세요(0을 입력 시 종료): ");

            String s1= scanner.nextLine();
            menu=Integer.parseInt(s1);

            //입력 허용 범위 외에 입력 방지
            if(menu==0)
            {
                System.out.println("종료");
                System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                break;
            } else if (!((1<=menu)&&(menu<=4)))
            {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            //메뉴를 선택한 경우 수량 입력 후 계산
            switch(menu){
                case 1:
                    System.out.println("돈가스를 선택하셨습니다. 구매수량을 입력하세요(1~97): ");
                    System.out.println("(뒤로가기: 99, 현재까지 합계보기: 98)");
                    String s2=scanner.nextLine();
                    int menu2=Integer.parseInt(s2); //수량 입력 받기
                    if (menu2==99){
                        break;
                    } else if (menu2==98) {
                        System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                    } else if (1<=menu2&&menu2<=97) {
                        sum+=p1*menu2;
                        c1+=menu2;
                        System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                        continue;
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                        continue;
                    }
                case 2:
                    System.out.println("햄버거를 선택하셨습니다. 구매수량을 입력하세요(1~97): ");
                    System.out.println("(뒤로가기: 99, 현재까지 합계보기: 98)");
                    String s3=scanner.nextLine();
                    int menu3=Integer.parseInt(s3); //수량 입력 받기
                    if (menu3==99){
                        break;
                    } else if (menu3==98) {
                        System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                    } else if (1<=menu3&&menu3<=97) {
                        sum+=p2*menu3;
                        c2+=menu3;
                        System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                        continue;
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                        continue;
                    }
                case 3:
                    System.out.println("김밥을 선택하셨습니다. 구매수량을 입력하세요(1~97): ");
                    System.out.println("(뒤로가기: 99, 현재까지 합계보기: 98)");
                    String s4=scanner.nextLine();
                    int menu4 =Integer.parseInt(s4); //수량 입력 받기
                    if (menu4 ==99){
                        break;
                    } else if (menu4 ==98) {
                        System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                    } else if (1<= menu4 && menu4 <=97) {
                        sum+=p3* menu4;
                        c3+=menu4;
                        System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                        continue;
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                        continue;
                    }
                case 4:
                    System.out.println("닭강정을 선택하셨습니다. 구매수량을 입력하세요(1~97): ");
                    System.out.println("(뒤로가기: 99, 현재까지 합계보기: 98)");
                    String s5=scanner.nextLine();
                    int menu5 =Integer.parseInt(s5); //수량 입력 받기
                    if (menu5 ==99){
                        break;
                    } else if (menu5 ==98) {
                        System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                    } else if (1<= menu5 && menu5 <=97) {
                        sum+=p4* menu5;
                        c4+=menu5;
                        System.out.printf("돈가스:%d개, 햄버거:%d개, 김밥%d개, 닭강정%d개로 총금액: %d\n",c1,c2,c3,c4,sum);
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
            }//수량계산 switch문의 끝
        }//main while문의 끝
    }
}
