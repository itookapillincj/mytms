package str;/*
 *ClassName:String
 *UserName:小阎王丷
 *CreateTime:2020/10/21 20:55
 */

public class String1{
    public static void main(String[] args) {
//        String a=new String("foo");
//        String b=a;
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
        int [] a={1,5,8,6,9,3,7};
        int i=2 ,j=5;
        int [] b=new int[4];
        System.arraycopy(a,2,b,0,4);
        for (int k= 0; k<b.length ; k++) {
            System.out.println(b[k]);
        }
    }
}
