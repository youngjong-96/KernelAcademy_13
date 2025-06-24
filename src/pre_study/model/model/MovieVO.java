package src.pre_study.model.model;

public class MovieVO {
    private String title; //영화제목
    private String date;  //개봉일
    private String mc;  //주인공
    private String type;  //장르
    private int time;  //러닝타임
    private int grade;  //등급(15세)

    public MovieVO(){}

    public MovieVO(String title, String date, String mc, String type, int time, int grade){
        this.title=title;
        this.date=date;
        this.mc=mc;
        this.type=type;
        this.time=time;
        this.grade=grade;
    }

    public void setTitle(String title){this.title=title;}
    public void setDate(String date){this.date=date;}
    public void setMc(String mc){this.mc=mc;}
    public void setType(String type){this.type=type;}
    public void setTime(int time){this.time=time;}
    public void setGrade(int grade){this.grade=grade;}

    public String getTitle(){return this.title;}
    public String getDate(){return this.date;}
    public String getMc(){return this.mc;}
    public String getType(){return this.type;}
    public int getTime(){return this.time;}
    public int getGrade(){return this.grade;}

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", mc='" + mc + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                ", grade=" + grade +
                '}';
    }
}
