package src.java_jungsuk.part6;

class Product{
    static int count=0;
    int serialNo;
    {
        ++count;
        serialNo=count;     //객체(제품)가 생성될 때마다 count를 증가하고 제품번호를 저장한다
    }
}
public class Ex6_29 {
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();

        System.out.println("p1의 serialNo은: "+p1.serialNo);
        System.out.println("p1의 serialNo은: "+p2.serialNo);
        System.out.println("p1의 serialNo은: "+p3.serialNo);
        System.out.println("생성된 제품의 갯수는: "+Product.count);
    }
}
