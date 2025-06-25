package src.java_jungsuk.part6;

public class Ex6_20 {
    int iv=10;                   //인스턴스 변수
    static int cv=20;            //static 변수(클래스 변수)

    int iv2=iv;                  //인스턴스 변수 -> 인스턴스 변수  :가능
    int iv3=cv;                  //인스턴스 변수 -> 클래스 변수    :가능
    //static int cv2=iv;         //static 변수  -> 인스턴스 변수  :불가능
    static int cv3=cv;           //static 변수  -> static 변수   : 가능

    void InstanceMethod(){
        System.out.println(iv);    //인스턴스 매서드 -> 인스턴스 변수  :가능
        System.out.println(cv);    //인스턴스 매서드 -> static 변수   :가능
    }

    static void staticMethod(){
        //System.out.println(iv);  //static 매서드  -> 인스턴스 변수  :불가능
        System.out.println(cv);    //static 매서드  -> static 변수   :가능
    }

    void InstanceMethod2(){
        InstanceMethod();          //인스턴스 매서드 -> 인스턴스 매서드 :가능
        staticMethod();            //인스턴스 매서드 -> static 매서드  :가능
    }

    static void staticMethod2(){
        //InstanceMethod();        //static 매서드  -> 인스턴스 매서드 :불가능
        staticMethod();            //static 매서드  -> static 매서드  :가능
    }
}
