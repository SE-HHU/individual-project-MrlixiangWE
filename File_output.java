
/*
* 传入List实现对文件的输入
* */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class File_output {
    public static void to_file(List<String> list, String name,int flag) throws Exception {

        BufferedWriter bw;


        bw = new BufferedWriter(new FileWriter(new String(name + ".txt")));
        int j = 1;
        if (flag == 2) {
            for (String i : list) {
                try {
                    bw.write(String.valueOf(j) + "、\t" + i);
                    bw.flush();
                    bw.newLine();
                    j++;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (flag == 1) {
            for (String i : list) {
                try {
                    bw.write(String.valueOf(j) + "、\t" + i + "=");
                    bw.flush();
                    bw.newLine();
                    j++;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
