


/*
 *由于程序中，题目和答案不伴生，故单独生成答案
 *目前不考虑乘除，乘除默认false
 * */

// Make_result test pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Make_result {

    List<String> questions;

    public Make_result() {
        System.out.println("no input check Make_result System exit");
        System.exit(0);
    }

    public Make_result(List<String> questions) {
        this.questions = questions;
    }


    public List<String> answers() {
        List<String> answer = new ArrayList<String>();
        for (String i : questions) {
            answer.add(operate(i));
        }
        return answer;
    }

    public static String operate(String question) {
        String[] str = question.split("[+,-]");
        int result = 0;
        String[] all_operate = {"+", "-", "*", "/"};
        List<Integer> operates = new ArrayList<Integer>();//快速访问，存储对应符号位置，enum四则运算位置

        for (int i = 0; i < question.length(); i++) {
            for (int j = 0; j < 4; j++) {
                if (all_operate[j].equals(String.valueOf(question.charAt(i)))) {
                    operates.add(j);
                }
            }
        }
        operates.add(0);//防越界
        operates.add(0);
        int lenstr = str.length;
        int len_operate = operates.size();
        int j = 0;
        result = Integer.valueOf(str[0]);
        for (int i = 1; i < lenstr; i++) {
            if ("+".equals(all_operate[operates.get(j)])) {
                result += Integer.valueOf(str[i]);
                j++;

            }
            if ("-".equals(all_operate[operates.get(j)])) {
                result -= Integer.valueOf(str[i]);
                j++;

            }
        }
        return String.valueOf(result);



      /*int result=0;
        int temp=0;
        int j=0;
        for(int i=0;i<question.length();i++)
        {

            if("+".equals(question.charAt(i)))
            {
                result+=temp;
                temp=0;
                j=0;
            }
            else if("-".equals(question.charAt(i)))
            {
                result-=temp;
                temp=0;
                j=0;
            }
            else
            {
                temp= (int) (temp*Math.pow(10,j))+Integer.valueOf(question.charAt(i));
                j++;
            }
        }
        return new String(String.valueOf(result));
        */
    }


}
