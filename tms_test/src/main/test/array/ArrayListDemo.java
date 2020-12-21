package array;/*
 *ClassName:ArrayListDemo
 *UserName:小阎王丷
 *CreateTime:2020/9/22 11:04
 */

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arr1=new ArrayList(3);
        System.out.println(arr1.size());
        arr1.add(132);
        arr1.add("sdf");
        arr1.add(5);
        arr1.add(9);
        //arr1.remove(1);
        //循环遍历arr1集合
        for (int i = 0; i <arr1.size() ; i++) {
            System.out.println(arr1.get(i));
        }
        int[] ary=new int[]{1,2,2,5,8,6,3};
        int[] new_ary=remove(5,ary);
        for (int i = 0; i <new_ary.length ; i++) {
            System.out.print(new_ary[i]+",");
        }
    }
    public static int[] remove(int index,int[] oldAry){
        if (index>=oldAry.length){
            throw new IndexOutOfBoundsException();
        }
        int[] new_ary=new int[oldAry.length-1];
        int numxount=oldAry.length-index-1;
        int numxount1=new_ary.length-index;
        System.arraycopy(oldAry,0,new_ary,0,index);
       System.arraycopy(oldAry,index+1,new_ary,index,numxount1);
        return new_ary;
    }

}
