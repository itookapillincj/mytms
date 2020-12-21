package util;/*
 *ClassName:StudentTest
 *UserName:小阎王丷
 *CreateTime:2020/9/22 21:11
 */

import java.util.ArrayList;
import java.util.Random;

public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student(0);
        Student student1=new Student(0);
        Object obj1= student1.hashCode();
         Object obj= student.hashCode();
         System.out.println(obj.equals(obj1));
        System.out.println(obj);
        System.out.println(obj1);


        System.out.println("=================");
        ArrayList<Student> list=new ArrayList<>();

        String[] name={"冷若寒", "蓝仲亭","金灿光", "木听风","屠横空","虚游天","风无痕","楚翌天", "莫非凡","上官绛雪", "慕容妃嫣", "独孤素琰"};
        Random r=new Random();
        double[] score={86,87,84,98,78,65,98,98,48,98,59,97};
        double sum1=0;
        for (int i = 0; i <name.length ; i++) {
            int id =r.nextInt(12);
           // Student stu=new Student(id,name[i],score[i]);
           // list.add(stu);
        }

        for (int i = 0; i <list.size() ; i++) {
          //  System.out.println(list.get(i).getScore());
         double sum2=list.get(i).getScore();
               sum1+=sum2;
        }
        double avg = sum1/list.size();
        System.out.println("平均成绩为："+avg);
    }
}
