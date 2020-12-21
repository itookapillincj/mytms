package hash;/*
 *ClassName:TestHash
 *UserName:小阎王丷
 *CreateTime:2020/9/29 11:30
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestHash {
    public static void main(String[] args) {
        //它是一个Hash结构，
        Properties pr=new Properties();
        pr.setProperty("x1","132465");
        System.out.println(pr.get("x1"));
        try {
            FileReader fr=new FileReader("a.txt");
            try {
                pr.load(fr);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(pr);
    }
}
