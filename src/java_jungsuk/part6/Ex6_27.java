package src.java_jungsuk.part6;

public class Ex6_27 {
    static{
        System.out.println("static 초기화 블럭");
    }
    {
        System.out.println("인스턴스 초기화 블럭");
    }
    public Ex6_27(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("메인에서 객체 ex생성");
        Ex6_27 ex=new Ex6_27();
        System.out.println("메인에서 객체 ex2생성");
        Ex6_27 ex2=new Ex6_27();
    }
}
