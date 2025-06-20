package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        //Q. 객체배열을 이용하여 4명의 학생(Student) 데이터를 저장하고 출력
        Student []std=new Student[3];

        std[0]=new Student("kim","math",22,"mail",2,"010-0000-0000");
        std[1]=new Student("Lee","Korean",21,"email",1,"010-1111-1111");
        std[2]=new Student("Han","English",23,"hmail",3,"010-2222-2222");

        for(int i=0;i<std.length;i++){
            System.out.println(std[i]);
        }

        System.out.println();

        for(Student st : std){
            System.out.println(st);
        }
    }
}
