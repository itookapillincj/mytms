package hash;/*
 *ClassName:TestHashMap
 *UserName:小阎王丷
 *CreateTime:2020/10/16 9:59
 */
import util.Student;

import java.util.HashMap;
import java.util.Map;
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,Student> hm=new HashMap<>();
        Student st=new Student("成立",25);
        Student st1=new Student("崔健",21);
        hm.put("123456",st);
        hm.put("156489",st1);
        System.out.println(hm.toString());
    }
    static class Student{
        private String phone;
        private String name;
        private int age;

        public  Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
