package src.java_jungsuk.part5;

//System클래스의 arraycopy 매서드 활용 예재
public class Ex5_4 {
    public static void main(String[] args) {
         char[]abc={'a','b','c'};
         char[]num={'0','1','2','3','4','5','6','7','8','9',};
        System.out.println(abc);
        System.out.println(num);

         //abc 배열과 num 배열을 합쳐서 새로운 배열을 만들기
        char[]hap=new char[abc.length+num.length];
        System.arraycopy(abc,0,hap,0,abc.length);
        System.arraycopy(num,0,hap,abc.length,num.length);
        System.out.println(hap);  //abc0123456789

        //abc 배열을 arraycopy 매서드로 num 배열에 다양하게 복사해보기
        System.arraycopy(abc,0,num,4,abc.length);   //0123abc789
        System.out.println(num);
        System.arraycopy(abc,1,num,0,2);   //bc23abc789
        System.out.println(num);
    }
}