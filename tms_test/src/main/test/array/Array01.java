package array;/*
 *ClassName:Array01
 *UserName:小阎王丷
 *CreateTime:2020/10/13 11:21
 */

public class Array01 {
    // 有两个有序整型数组a1={1,3,5,7}, a2={4,6,9}
    // 请编写程序合并这两个数组到一个新的数组中，要求合并后的数组仍然有序
    public static void main(String[] args) {
        int [] ary1={1,3,5,7};
        int [] ary2={4,6,9};
        Array01 a=new Array01();
        a.f(ary1,ary2);
    }
    public void f(int[] ary1,int[] ary2){
        int [] ary3=new int[ary1.length+ary2.length];
        int i=0,j=0,k=0;
        while (i<ary1.length&&j<ary2.length){
            if (ary1[i]>ary2[j]){
                ary3[k]=ary2[j];
                j++;
            }else {
               ary3[k]= ary1[i];
                i++;
            }
            k++;

        }
        if (ary1.length-i!=0){
            for (;i<ary1.length;i++){
                ary3[k]=ary1[i];
                k++;
            }
        }else {
            for (;j<ary2.length;j++){
                ary3[k]=ary2[j];
                k++;
            }
        }
        for (int l = 0; l <ary3.length ; l++) {
            System.out.print(ary3[l]+",");
        }

    }

}
