package fc.java.model;

public class PersonVO {
    //기본정보
    private String name;
    private int age;
    private String phone;

    //초기화 방법으로 값 넣기
    public PersonVO(){

    }
    public PersonVO(String name,int age,String phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    //setter 매서드
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    //getter 매서드
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getPhone(){
        return this.phone;
    }

    //toString 매서드
    public String toString(){
        return name+"\t"+age+"\t"+phone;
    }
}
