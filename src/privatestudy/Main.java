package fc.java.privatestudy;

public class Main {
    public static void main(String[] args) {
        MemberVO []mv=new MemberVO[3];

        mv[0]=new MemberVO();
        mv[0].setName("kim");
        mv[0].setAge(20);
        mv[0].setEmail("test@test.com");
        mv[0].setPhone("010-5387-3512");
        mv[0].setGender("남");

        mv[1]=new MemberVO();
        mv[1].setName("Lee");
        mv[1].setAge(22);
        mv[1].setEmail("test2@test.com");
        mv[1].setPhone("010-5387-3512");
        mv[1].setGender("여");

        mv[2]=new MemberVO();
        mv[2].setName("park");
        mv[2].setAge(25);
        mv[2].setEmail("test3@test.com");
        mv[2].setPhone("010-5387-3512");
        mv[2].setGender("남");

        for(int i=0;i<mv.length;i++){
            System.out.println(mv[i]);
        }
    }
}
