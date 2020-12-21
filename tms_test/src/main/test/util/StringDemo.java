package util;/*
 *ClassName:StringDemo
 *UserName:小阎王丷
 *CreateTime:2020/9/15 22:19
 */

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入放假日期（xx-xx）");
        String beginDate =sc.next();
        System.out.println("请输入开学日期（xx-xx）");
        String endDate =sc.next();
        String[] begin=beginDate.split("-");//获得放假日期
        String[] end=endDate.split("-");//获得开学日期
        int[] array = new int[62];//七月八月总天数
        int temp =1;//停电的间隔
        for(int i=1;i<=62;i=i+temp) {
            array[i] = i;
            temp++;
            //System.out.println(temp);
            System.out.println(array[i]);
        }
        int num = 0;//停电天数
        //8月放假
        if (Integer.parseInt(begin[0])>=8&&Integer.parseInt(end[0])>=8){
            int a=31+Integer.parseInt(begin[1]);//从7月1到放假日期的总天数
            int b=31+Integer.parseInt(end[1]);//从7月1到开学日期的总天数
            for (int i = 0; i <array.length ; i++) {//遍历两个月总天数中停电的天数
                if (array[i]>=a&&array[i]<b){
                    num++;
                }
            }
        }
        //七月放假，七月开学
        if (Integer.parseInt(begin[0])<8&&Integer.parseInt(end[0])<8){
            int a=Integer.parseInt(begin[1]);//从7月1到放假日期的总天数
            int b=Integer.parseInt(end[1]);//从7月1到开学日期的总天数
            for (int i = 0; i <array.length ; i++) {//遍历两个月总天数中停电的天数
                if (array[i]>=a&&array[i]<b){
                    num++;
                }
            }
        }
        //七月放假，八月开学
        if (Integer.parseInt(begin[0])<8&&Integer.parseInt(end[0])>7){
            int a=Integer.parseInt(begin[1]);//从7月1到放假日期的总天数
            int b=31+Integer.parseInt(end[1]);//从7月1到开学日期的总天数
            for (int i = 0; i <array.length ; i++) {//遍历两个月总天数中停电的天数
                if (array[i]>=a&&array[i]<b){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
