package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        //객체 배열
        Book []b=new Book[2];
        b[0]=new Book();
        b[1]=new Book();

        b[0].author="Mr.Lee";
        b[0].title="java";
        b[0].company="muje";
        b[0].page=111;

        b[1].author="Mr.Kim";
        b[1].title="python";
        b[1].company="easy";
        b[1].page=351;

        for(int i=0;i<b.length;i++){
            System.out.println(b[i].author+"\t"+b[i].title+"\t"+b[i].company+"\t"+b[i].page);
        }

        //1차원 배열
        int []a=new int[5];

        for(int i=0;i<a.length;i++){
            a[i]=i+1;
            System.out.print("a"+"["+i+"]"+"="+a[i]+"\t");
        }

        System.out.println("");

        //2차원 배열
        int[][]c=new int[2][3];

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=j+1;
                System.out.print(c[i][j]);
            }
            System.out.println();
        }

        //가변 길이 배열 만들기
        String[][]d=new String[5][];
        d[0]=new String[1];
        d[1]=new String[2];
        d[2]=new String[3];
        d[3]=new String[4];
        d[4]=new String[5];

        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                d[i][j]="*";
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }
}
