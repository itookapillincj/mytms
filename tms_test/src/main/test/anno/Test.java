package anno;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.age = 190;
        Class cls1 = Person.class;
        Class cls2 = person.getClass();
        Class cls3 = null;
        try {
            cls3 = Class.forName("anno.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);
        System.out.println(cls1 == cls3);
        //获取类上的注解
        Annotation anno = cls1.getAnnotation(AgeAnno.class);
        System.out.println(anno);

        //获取字段上的注解
        //getField()获取类的public字段(属性)

        AgeAnno anno1 = cls1.getField("age").getAnnotation(AgeAnno.class);
        System.out.println(anno1);
        int min = anno1.min();
        int max = anno1.max();

        System.out.println(min);
        System.out.println(max);

        if(person.age > max) {
            throw new Exception("年龄的值不符合要求，必须在 "+min+"~"+max+"之间");
        }

        //获取所有注解

    }
}
