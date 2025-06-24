package src.java_jungsuk.part6;

public class Time {
    private int  hour;
    private int min;
    private float sec;

    public int getHour(){return hour;}
    public int getMin(){return min;}
    public float getSec(){return sec;}

    public void setHour(int h){
        if(0>h || h>23)return;
        hour=h;
    }
    public void setMin(int m){
        if(0>m || m>59)return;
        min=m;
    }
    public void setSec(float s){
        if(0>s || s>59)return;
        sec=s;
    }
}
