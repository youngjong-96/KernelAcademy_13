package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        //Q. 정수 6개를 저장할 배열을 생성
        int []arr=new int[6];
        
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
            System.out.println(i+1+"번째 숫자는: "+ i);
        }

        //Q. 학생 객체를 설계하고 데이터를 저장한 후 출력
        Student s=new Student("홍길동","컴퓨터공학과", 21, "test@naver.com", 2, "010-4534-4231");
        System.out.println(s.toString());
    }
}
