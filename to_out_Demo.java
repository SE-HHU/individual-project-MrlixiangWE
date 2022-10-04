import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.ErrorManager;

public class to_out_Demo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("四则运算生成系统");
        jf.setLayout(new FlowLayout());
        Panel pa=new Panel();
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setBounds(500,300,400,200);
        TextField text=new TextField("输入生成数量",20);
        Panel pb=new Panel();
        CheckboxGroup cg=new CheckboxGroup();
        JLabel jl1=new JLabel("是否生成负数：");
        pb.setLayout(new FlowLayout());
        pb.add(jl1);
        pb.add(new Checkbox("open",cg,false));
        pb.add(new Checkbox("close",cg,true));

        Panel pc=new Panel();
        CheckboxGroup cg2=new CheckboxGroup();
        JLabel jl2=new JLabel("是否生成乘除：");
        pc.setLayout(new FlowLayout());
        pc.add(jl2);
        pc.add(new Checkbox("open",cg2,false));
        pc.add(new Checkbox("close",cg2,true));

        Panel pd=new Panel();
        Button bt=new Button("                   "+"Make out"+"                   ");
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                to_out to =new to_out();
                try {
                    String s = text.getText();
                    to.setN(Integer.valueOf(s));
                }
                catch (Exception a)
                {
                    JOptionPane.showMessageDialog(null,"未输入生成个数或输入错误，已按默认生成","Waring",JOptionPane.ERROR_MESSAGE);
                }
                finally {
                    to.Make_out();
                    JOptionPane.showMessageDialog(null,"已完成生成","提示",JOptionPane.DEFAULT_OPTION);
                    System.exit(0);
                }
            }
        });
        pd.add(bt);


        pa.add(text);
        jf.add(pa);
        jf.add(pb);
        jf.add(pc);
        jf.add(pd);
    }
}







/*        to_out to=new to_out();
        to.Make_out();
  */



