import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zhuanyi {



    public static void main(String[] args) {
        MarkCalculator2 markCalculator2 = new MarkCalculator2();

        List<Integer[]> demo = new ArrayList<>();

        for (int i=0;i<=10;i++){//ass1
            for (int j=0;j<=10;j++){// ass2
                for (int m=0;m<=10;m++){//lab
                    for (int n=0;n<=100;n++){// final
                        //No.2(直接复制对应计分器代码)
                        int cal0 = (i * 150 + j * 150 + m * 100 + n * 60);
                        int cal1 = ((cal0 % 100 < 50) ? (cal0 / 100) : (cal0 / 100) + 1);
                        //No.0(直接复制对应计分器代码)
                        int cal2= (int) Math.round(((i / 10.0f) * 0.15f + (j / 10.0f)
                                * 0.15f + (m / 10.0f) * 0.1f + (n / 100.0f) * 0.6f) * 100.0f);
                        if (cal1!=cal2){
                            Integer[] coes = {m,i,j,n};
                            demo.add(coes);
                            coes=null;
                        }
                    }
                }
            }
        }

        for (Integer[] intArr : demo){
            System.out.println(Arrays.toString(intArr));
//            markCalculator2.calculateMark(intArr[0],intArr[1],intArr[2] ,intArr[3],true,false);
            System.out.println();

        }


    }
}
