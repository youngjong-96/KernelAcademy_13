package src.java_jungsuk;

import java.util.Scanner;

//5x5 빙고
public class Ex5_21 {
    public static void main(String[] args) {
        int SIZE=5;
        int x=0,y=0,num=0;

        int[][]bingo=new int[SIZE][SIZE];
        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                bingo[i][j]=i*SIZE+j+1;
            }
        }

        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                x = (int)(Math.random()*SIZE);
                y = (int)(Math.random()*SIZE);

                int tmp=bingo[x][y];
                bingo[x][y]=bingo[i][j];
                bingo[i][j]=tmp;
            }
        }

        do{
            for(int i=0;i<SIZE;i++){
                for(int j=0;j<SIZE;j++){
                    System.out.printf("%4d",bingo[i][j]);
                }
                System.out.println();
            }

            System.out.printf("1~%d 까지의 숫자를 입력하세요.(종료:0)> ",SIZE*SIZE);
            String tmp=scanner.nextLine();
            num=Integer.parseInt(tmp);

            outer:
            for(int i=0;i<SIZE;i++){
                for(int j=0;j<SIZE;j++){
                    if(bingo[i][j]==num){
                        bingo[i][j]=0;
                        break outer;
                    }
                }
            }
        }while (num!=0);
    }
}