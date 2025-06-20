package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO vo=new MovieVO("mission impossible","2025-06-01","tom","action",180,15);
        System.out.println(vo.toString());
    }
}
