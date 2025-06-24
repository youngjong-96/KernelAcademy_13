package fc.java.part3;

import src.pre_study.model.MyUtil;
import src.pre_study.model.MyUtil1;

public class StaticAccess {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int sum=MyUtil.hap(a,b);    //클래스이름.호출매서드
        System.out.println("sum = " + sum);

        MyUtil1 my=new MyUtil1();     //객체 생성
        int sum1= my.hap1(a,b);         //생성한 객체.호출매서드
        System.out.println("sum1 = " + sum);
    }
}
