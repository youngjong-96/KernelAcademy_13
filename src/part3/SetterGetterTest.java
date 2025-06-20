package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        PersonVO p=new PersonVO();
        p.setName("홍길동");
        p.setAge(20);
        p.setPhone("010-1234-5678");

        String name=p.getName();
        int age=p.getAge();
        String phone=p.getPhone();

        System.out.println(name+"\t"+age+"\t"+phone);
    }
}
