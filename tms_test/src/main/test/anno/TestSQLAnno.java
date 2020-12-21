package anno;

import java.lang.reflect.Method;

public class TestSQLAnno {
    public static void main(String[] args) throws Exception {
        //先获取Class对象
        Class cls = Person.class;
        //获取类中的方法
        Method m = cls.getMethod("queryPerson");
        //获取定义在方法的注解
        SQLQuery sqlQuery = (SQLQuery) m.getAnnotation(SQLQuery.class);
        //获取定义在类方法上的注解信息
        String sql = sqlQuery.sql();
        System.out.println(sql);


    }
}
