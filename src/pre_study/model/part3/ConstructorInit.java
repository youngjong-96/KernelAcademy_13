package fc.java.part3;

import src.pre_study.model.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO p=new PersonVO("David",31,"010-6798-4123");
        String result=p.toString();
        System.out.println(result);
    }
}
