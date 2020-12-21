package array;/*
 *ClassName:Array1
 *UserName:小阎王丷
 *CreateTime:2020/10/9 12:08
 */

public class Array1 {
    public static void main(String[] args) {
         int[] ary={1,4,5,7,8,9};
         int i=0,j=ary.length-1;
         int mid=ary.length/2;
             for (;i<mid;i++,j--){
                 int t=ary[i];
                 ary[i]=ary[j];
                 ary[j]=t;
             }


         traverse(ary);

    }
    public static void traverse(int[] ary){
        for (int i = 0; i <ary.length ; i++) {
            System.out.print(ary[i]+",");
        }
    }
}
