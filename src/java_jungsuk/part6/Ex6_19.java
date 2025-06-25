package src.java_jungsuk.part6;

public class Ex6_19 {
    long a,b;    //인스턴스 변수(iv) 선언
    Ex6_19(){
        this.a=1;
        this.b=1;
    }

    long add(){return a+b;}  //인스턴스 매서드(im) 선언 - 인스턴스 변수 a,b 사용
    static long add2(long a, long b){return a+b;}  //클래스 매서드(cm) 선언 - 매개변수 사용

    public static void main(String[] args) {
        //System.out.println(add());        //클래스 매서드에서 인스턴스 매서드 호출 불가
        System.out.println(add2(1,2));   //같은 클래스 내에서는 Ex6_19.add() 이렇게 클래스명을 안 적어도 됨

        Ex6_19 t=new Ex6_19();
        System.out.println(t.add());        //객체 생성 후 인스턴스 매서드 호출 가능
    }
}
