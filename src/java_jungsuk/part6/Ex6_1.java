package src.java_jungsuk.part6;

public class Ex6_1 {
    public static void main(String[] args) {
        TV[]tvarr=new TV[5];
        for(int i=0;i<tvarr.length;i++){
            tvarr[i]=new TV();
            tvarr[i].channel=(int)(Math.random()*9+1);
        }

        for(int i=0;i<tvarr.length;i++){
            tvarr[i].channelUp();
            tvarr[i].channelDown();
            System.out.printf("tvarr[%d]의 현재 채널은: %d%n",i,tvarr[i].channel);
        }
    }
}

class TV{
    String color;
    boolean power;
    int channel;

    void power(){power=!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}