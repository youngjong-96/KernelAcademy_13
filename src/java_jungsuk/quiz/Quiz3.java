package src.java_jungsuk.quiz;

import java.util.Arrays;

//5x5배열을 받아서 빙고 갯수를 반환하는 bingoCnt() 매서드를 작성하시오.
public class Quiz3 {
    public static void main(String[] args) {
        int[][] bingoArr = {
                {1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0}
        };

        //빙고=한 행이나 한 열의 값이 모두 일치  bingoArr[행][열]
        //bingoArr[0~4][i]가 전부 일치 or bingoArr[i][0~4]가 전부 일치
        int count = 0; //빙고 갯수

        //행빙고 확인 - 행마다 1이 몇개인지 세서 5개이면 빙고이다
        for (int i = 0; i < bingoArr.length; i++) {
            int sumrow=0; //행 합계
            for (int j = 0; j < bingoArr[i].length; j++) {
                sumrow+=bingoArr[i][j];
            }
            if(sumrow==5){count+=1;}
        }

        //열빙고 확인 - 열마다 1이 몇개인지 세서 5개이면 빙고이다
        for (int i = 0; i < bingoArr.length; i++) {
            int sumcol=0; //행 합계
            for (int j = 0; j < bingoArr[i].length; j++) {
                sumcol+=bingoArr[j][i];
            }
            if(sumcol==5){count+=1;}
        }
        System.out.println("빙고의 갯수는:"+count);
    }
}
