package JavaDemo;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一串字符包括英文和数字：");
        String  str = sc.nextLine();
        int count = 0;//计数器
        for (int i = 0; i <str.length() ; i++) {
            if((str.charAt(i)>='0'&&str.charAt(i)<='9')){
                count++;//累加
            }
        }
        System.out.println(count);
    }
}
