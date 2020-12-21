package JavaDemo;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        int count = 0;//记录总值
        for (int i = 1; i <=num ; i++) {
            if(i==1){
                count = 1;
            }
            if(i>1){
                count=count*i;//累乘
            }
        }
        System.out.println(count);
    }
}
