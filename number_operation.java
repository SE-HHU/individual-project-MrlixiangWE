
/*
* 此类用以生成随机数和随机符号，一次生成一个
* 应符合运算规律：
*   1.是否生成正负数可控
*   2.是否含有乘除法可控
*   3.没想起来，哈哈哈哈哈
*
* */


//independent test pass


import java.util.Random;

public final class number_operation {
    boolean Mul_and_Div;
    boolean NegNumber;
    int range_min;
    int range_max;

    public number_operation ()
    {
        Mul_and_Div=false;
        NegNumber=false;
        range_min=1;
        range_max=20;
    }

    public number_operation(boolean mul_and_Div, boolean negNumber, int range_min, int range_max)
    {
        Mul_and_Div = mul_and_Div;
        NegNumber = negNumber;
        this.range_min = range_min;
        this.range_max = range_max;
    }

    public number_operation(boolean mul_and_Div, boolean negNumber)
    {
        Mul_and_Div = mul_and_Div;
        NegNumber = negNumber;
    }

    public number_operation(int range_min, int range_max)
    {
        this.range_min = range_min;
        this.range_max = range_max;
    }

    public boolean isMul_and_Div() {
        return Mul_and_Div;
    }

    public void setMul_and_Div(boolean mul_and_Div) {
        Mul_and_Div = mul_and_Div;
    }

    public boolean isNegNumber() {
        return NegNumber;
    }

    public void setNegNumber(boolean negNumber) {
        NegNumber = negNumber;
    }

    public int getRange_min() {
        return range_min;
    }

    public void setRange_min(int range_min) {
        this.range_min = range_min;
    }

    public int getRange_max() {
        return range_max;
    }

    public void setRange_max(int range_max) {
        this.range_max = range_max;
    }

    public String Number()
    {
        Random rn=new Random();
        int number=rn.nextInt(range_min,range_max);
        if(number<0)
        {
            return new String("("+number+")");
        }
        return String.valueOf(number);
    }

    public String Operation()
    {
        Random ro=new Random();
        String[] Operations={"+","-","*","/"};
        if(Mul_and_Div)
        {
            return Operations[ro.nextInt(4)];
        }
        else
            return Operations[ro.nextInt(2)];
    }

}
