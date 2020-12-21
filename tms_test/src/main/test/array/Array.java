package array;/*
 *ClassName:Array
 *UserName:小阎王丷
 *CreateTime:2020/10/9 10:40
 */

public class Array {
    public static void main(String[] args) {
        int[] ary={1,5,8,4,6,9,10,11};
        for (int i = ary.length/2; i >=0 ; i--) {
            System.out.println(ary[i]);
        }
        System.out.println("================");
        for (int j = ary.length/2+1; j<=ary.length-1;j++){
            System.out.println(ary[j]);
        }
        System.out.println("==========");
        int a=4;
        int b=a>>1;
        System.out.println(b);
    }


}
