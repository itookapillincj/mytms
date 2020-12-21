package util;/*
 *ClassName:StringUtil1
 *UserName:小阎王丷
 *CreateTime:2020/9/15 16:09
 */

public class StringUtil1 {
    public static void main(String[] args) {
        String str = "I am a student";
        String[] str1 = str.split(" ");
        for (int i = str1.length-1; i >= 0; i--) {
            System.out.print(str1[i]+" ");
        }
    }
}
