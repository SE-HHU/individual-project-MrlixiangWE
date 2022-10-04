
/*
*此类应完成 Make_Cal_Set 和Make_result 的打包，以便输出
*
* 应集成输入
* */


import java.util.List;
import java.util.Scanner;

public class to_out {
    /*int n;//式子个数，供Make_Cal_Set用
    int maxsymbol;
    int minsymbol;//最多最少符号数，供Calculation用
    int rangemin;
    int rangemax;//范围，供number_operationg用
    boolean mul_div;//乘除开关
    boolean negnumber;//负数开关
    */
    Make_Cal_Set mcs;
    number_operation no;
    Calculation cul;
    public to_out()
    {
        no=new number_operation();
        cul=new Calculation(no);
        cul.setMax_symbols(2);
        mcs = new Make_Cal_Set(cul);

    }

    public void Make_out ()
    {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("input name");
        String name=sc.nextLine();*/
        List<String> questions=mcs.Make_qeusetions();
        Make_result mr=new Make_result(questions);
        List<String> answers=mr.answers();
        try {
            File_output.to_file(questions, "question",1);
            File_output.to_file(answers, "answer",2);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    public void setN(int n) {
        mcs.n=n;
    }

    public void setMaxsymbol(int maxsymbol) {
        cul.max_symbols = maxsymbol;
    }

    public void setMinsymbol(int minsymbol) {
        cul.min_symbols = minsymbol;
    }

    public void setRangemin(int rangemin) {
        no.range_min = rangemin;
    }

    public void setRangemax(int rangemax) {
        no.range_max = rangemax;
    }

    public void setMul_div(boolean mul_div) {
        no.Mul_and_Div = mul_div;
    }

    public void setNegnumber(boolean negnumber) {
        no.NegNumber= negnumber;
    }
}
