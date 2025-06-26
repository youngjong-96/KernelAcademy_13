package src.java_jungsuk.part6;

class document{
    static int count=0;
    String title;

    document(){
        this("제목없음"+ ++count);
    }

    document(String title){
        this.title=title;
        System.out.printf("문서 [%s]가 생성되었습니다.%n",title);
    }
}
public class Ex6_30 {
    public static void main(String[] args) {
        document d1=new document("문서1번");
        document d2=new document();
        document d3=new document();
        document d4=new document("생성자로 초기화");
        document d5=new document();
    }
}