package src.java_jungsuk.quiz;

import java.util.Scanner;

//3개의 정수를 받아서 셋 중에 가운데 크기의 값을 반환하는 mid()매서드를 작성하고 Test 하시오.
public class Quiz2 {


    public static void main(String[] args) {
        System.out.println(mid(1,2,3));
        System.out.println(mid(12,5,3));
        System.out.println(mid(1,4,6));
        System.out.println(mid(0,34,556));
    }

    static int mid(int a, int b, int c) {
        //셋 중에 가운데 크기의 값을 찾기
        if (a > b) {
            if (a < c) {
                {
                    return a;
                }
            } else if (b > c) {
                return b;
            } else {
                return c;
            }
        } else{
            if (a>c){
                return a;
            } else if (b<c) {
                return b;
            }else{
                return c;
            }
        }
    }
}