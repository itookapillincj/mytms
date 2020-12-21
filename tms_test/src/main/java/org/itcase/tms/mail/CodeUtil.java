package org.itcase.tms.mail;/*
 *ClassName:CodeUtil
 *UserName:小阎王丷
 *CreateTime:2020/12/4 22:35
 */



import java.util.Random;

public class CodeUtil {

    public String stringCodeUtil() {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int length = 10;
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(str.length());//取一个0-str.length的数
            sb.append(str.charAt(number));//返回指定索引处的字符
        }
        return sb.toString();
    }
}