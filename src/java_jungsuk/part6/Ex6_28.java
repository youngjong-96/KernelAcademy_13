package src.java_jungsuk.part6;

class InitTest{
    static int cv=1;
    int iv=0;

    static{cv=2;}
    {iv=2;}

    InitTest(){iv=3;}
}
public class Ex6_28 {
    public static void main(String[] args) {
        InitTest it=new InitTest();
        System.out.println("cv="+InitTest.cv);
        System.out.println("iv="+it.iv);
    }
}
