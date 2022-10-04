
/*
* hashset<String> 存储式子，默认实现无重复，但是tm的草
* 算了
* 用treeset<String>吧
* */

//Make_Cal_Set test pass

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public final class Make_Cal_Set {

    int n;//读入式子的个数
    Calculation cl;
    public Make_Cal_Set()
    {
        n=20;
        this.cl=new Calculation();
    }
    public Make_Cal_Set(int n) {
        this.n = n;
    }

    public Make_Cal_Set(int n, Calculation cl) {
        this.n = n;
        this.cl = cl;
    }

    public Make_Cal_Set(Calculation cl) {
        n=20;
        this.cl = cl;
    }

    public @NotNull List<String> Make_qeusetions()
    {
        long start=System.currentTimeMillis();
        long end;
        long flag=2000;//毫秒计数
        List<String> ts=new LinkedList<String>();
        if (n<=0)
        {
            System.out.println("Error check your number input in Make_Cal_Set");
            System.exit(0);

        }
        while(ts.size()<n)
        {
            String s= cl.make_calculations();
            String answer=Make_result.operate(s);
            int in=Integer.valueOf(answer);

            if (in > 0)
            {
                ts.add(s);
                ts = ts.stream().distinct().collect(Collectors.toList());
            }
            end=System.currentTimeMillis();
            if((end-start)>flag)
            {
                ts.add("System Error: check your input\nTime extract range: connect to Developer");
                break;
            }
        }
        return ts;

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Calculation getCl() {
        return cl;
    }

    public void setCl(Calculation cl) {
        this.cl = cl;
    }
}
