package MyApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author 小白
 * @create 2021/5/26
 */
public class Main {

    public static void main(String[] args) throws Exception{
        //其根目录为D:\maven(因为工程为D:\maven)
        File fil = new File("review/p.xml");
        System.out.println(fil.getAbsolutePath());
        BufferedReader reader = new BufferedReader(new FileReader(fil));
    }
}
