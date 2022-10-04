
/*
1.生成单个式子
2.由main函数传入最大和最小符号量
    max_symbols and min_symbols
3.以String输出
4.创建make_calculations 函数，执行一次输出一个
5.由main传入长度,最大值，最小值
       max_length and min_length
 */

//Calculation test pass


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.security.SecureRandom;
import java.util.*;

public  class Calculation {
    int max_symbols;
    int min_symbols;
    number_operation no;
    /*int max_length;
    int min_length;*/
    //没有必要，因为可以从 symbols 推算出 length 的范围
    public Calculation()
    {
        max_symbols=2;
        min_symbols=1;
        this.no=new number_operation();
    }

    public Calculation(int max_symbols, int min_symbols, number_operation no)
    {
        this.max_symbols = max_symbols;
        this.min_symbols = min_symbols;
        this.no=no;
    }

    public Calculation(number_operation no) {
        max_symbols=3;
        min_symbols=1;
        this.no = no;
    }

    public String make_calculations()
    {
        int n=0; //数字数，符号数为其减一
        if(max_symbols>min_symbols)
        {
            Random ra = new Random();
            n = ra.nextInt(min_symbols + 1, max_symbols + 2);
        }
        else if (max_symbols<min_symbols)
        {
            System.out.println("Error check your symbols number input in Calculation");
            System.exit(0);
        }
        else
        {
            n=max_symbols+1;
        }
        String calculation=new String();
        /*String answers=new String();
        Map<String,String> puple= new HashMap<String, String>();
        int result=0;
        */
        for(int i=1;i<2*n;i++)
        {
            if(i%2!=0)
            {
                calculation+=no.Number();
            }
            else
            {
                calculation+=no.Operation();
            }
        }



        return calculation;


    }


    public int getMax_symbols() {
        return max_symbols;
    }

    public void setMax_symbols(int max_symbols) {
        this.max_symbols = max_symbols;
    }

    public int getMin_symbols() {
        return min_symbols;
    }

    public void setMin_symbols(int min_symbols) {
        this.min_symbols = min_symbols;
    }

    public number_operation getNo() {
        return no;
    }

    public void setNo(number_operation no) {
        this.no = no;
    }
}
