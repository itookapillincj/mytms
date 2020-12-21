package anno;


public class Person extends Object {


    public String name;

    @AgeAnno(min=18, max=60)
    public int age;

    @SQLQuery(sql="select name,age from person")
    public void queryPerson() {

    }



    @Override
    public String toString() {
        return super.toString();
    }
}
