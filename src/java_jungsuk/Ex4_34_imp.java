package src.java_jungsuk;

import java.util.Scanner;

//사용자에게 메뉴 선택 받아서 수량만큼 가격 계산하기
public class Ex4_34_imp {
    public static int []count=new int[]{0,0,0,0};
    public static int []price=new int[]{10000,7500,4500,7200};
    public static String []menu=new String[]{"돈가스","햄버거","김밥","닭강정"};
    public static int opt =0;
    public static int sum=0;

    //현재 주문상황을 보여줌
    static void show(){
        System.out.printf("%s:%d개, %s:%d개, %s:%d개, %s:%d개로 총금액: %d\n",menu[0],count[1],menu[1],count[1],menu[2],count[2],menu[3],count[3],sum);
    }
    //주문 메뉴에 따라 수량을 저장하고 금액 추가
    static void calc(int opt, int c){
        count[opt]+=c;
        sum+=price[opt]*c;
    }

    //선택한 메뉴 보여주고 옵션 보여주기
    static void menu(int opt){
        System.out.printf("%s를 선택하셨습니다. 구매수량을 입력하세요(1~97): \n",menu[opt]);
        System.out.println("(뒤로가기: 99, 현재까지 합계보기: 98)");
    }

    public static void main(String[] args) {
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
            opt =Integer.parseInt(s1);

            //입력 허용 범위 외에 입력 방지
            if(opt ==0)
            {
                System.out.println("종료");
                show();
                break;
            } else if (!((1<= opt)&&(opt <=4)))
            {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            //메뉴를 선택한 경우 수량 입력 후 계산
            switch(opt){
                case 1:
                    menu(opt);
                    String s2=scanner.nextLine();
                    int menu2=Integer.parseInt(s2); //수량 입력 받기
                    if (menu2==99){
                        break;
                    } else if (menu2==98) {
                        show();
                    } else if (1<=menu2&&menu2<=97) {
                        calc(opt,menu2);
                        show();
                        continue;
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                        continue;
                    }
                case 2:
                    menu(opt);
                    String s3=scanner.nextLine();
                    int menu3=Integer.parseInt(s3); //수량 입력 받기
                    if (menu3==99){
                        break;
                    } else if (menu3==98) {
                        show();
                    } else if (1<=menu3&&menu3<=97) {
                        calc(opt,menu3);
                        show();
                        continue;
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                        continue;
                    }
                case 3:
                    menu(opt);
                    String s4=scanner.nextLine();
                    int menu4 =Integer.parseInt(s4); //수량 입력 받기
                    if (menu4 ==99){
                        break;
                    } else if (menu4 ==98) {
                        show();
                    } else if (1<= menu4 && menu4 <=97) {
                        calc(opt,menu4);
                        show();
                        continue;
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                        continue;
                    }
                case 4:
                    menu(opt);
                    String s5=scanner.nextLine();
                    int menu5 =Integer.parseInt(s5); //수량 입력 받기
                    if (menu5 ==99){
                        break;
                    } else if (menu5 ==98) {
                        show();
                    } else if (1<= menu5 && menu5 <=97) {
                        calc(opt,menu5);
                        show();
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
            }//수량계산 switch 문의 끝
        }//main while 문의 끝
    }//main 문의 끝
}
