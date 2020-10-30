

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Replace {

    public static String path="/home/ckg/secnod/secnod/HomeWork/src/main/resources/a.txt";

    public static void main(String[] args) throws Exception {
        //待替换字符
        String aStr=";";
        //替换字符
        String bStr="?";

        //读取文件
        File file=new File(path);

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

        //内存流
        CharArrayWriter caw=new CharArrayWriter();

        //替换
        String line=null;

        //以行为单位进行遍历
        while((line=br.readLine())!=null){
            //替换每一行中符合被替换字符条件的字符串
            line=line.replaceAll(aStr, bStr);
            //将该行写入内存
            caw.write(line);
            //添加换行符，并进入下次循环
            caw.append(System.getProperty("line.separator"));
        }
        //关闭输入流
        br.close();

        //将内存中的流写入源文件
        FileWriter fw=new FileWriter(file);
        caw.writeTo(fw);
        fw.close();
    }
}