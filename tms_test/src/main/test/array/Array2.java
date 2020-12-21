package array;/*
 *ClassName:Array2
 *UserName:小阎王丷
 *CreateTime:2020/10/12 0:05
 */

public class Array2 {
    public static void main(String[] args) {
       // 定义一个整型数组，将数组的第i个元素(i从0开始递增)和第j个元素
        // (j从最后一个元素开始递减)相加
        // ，将相加的结果存 储在另一个数组中
        int[] ary={1,2,3,4,5,8};
        int[] ary1=new int[ary.length];
        int i=0,j=ary.length-1;
        for ( i = 0; i <ary.length ; i++,j--) {
              ary1[i]=ary[i]+ary[j];
        }
        for (int k = 0; k <ary1.length ; k++) {
            System.out.print(ary1[k]+",");
        }
    }
}
