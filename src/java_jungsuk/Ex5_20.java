package src.java_jungsuk;

import java.util.Scanner;

//배 좌표 맞충기 게임
public class Ex5_20 {
    public static void main(String[] args) {
        int SIZE=10;
        int x=0,y=0;
        char[][]board=new char[SIZE][SIZE];
        char[][]shipboard={
                {0,0,0,0,0,0,1,1,1},
                {1,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1},
                {0,0,0,0,1,0,0,0,0},
                {0,0,0,0,1,0,0,0,0},
                {0,0,0,0,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,0},
        };

        for(int i=0;i<SIZE;i++){
            board[0][i]=board[i][0]=(char)(i+'0');
        }
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("좌표를 입력하세요. ex.11(종료는 00)> ");
            String input=scanner.nextLine();
            if(input.length()==2){
                x=input.charAt(0)-'0';
                y=input.charAt(1)-'0';

                if(x==0 && y==0)break;
            }
            if(input.length()!=2 || x<=0 || x>= SIZE || y<=0 || y>= SIZE){
                System.out.println("잘못 입력하였습니다.");
                continue;
            }

            board[x][y]=shipboard[x-1][y-1]==1?'O':'X';

            for(int i=0;i<SIZE;i++){
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
}
