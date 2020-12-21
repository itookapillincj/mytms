package aryadd;

import java.util.Arrays;

public class ArrayInsertDemo {

    public static void main(String[] args) throws Exception {
        int[] ary = {3,5,6,7,8,99,34,9};
        insert0(1, 88, ary);
        /*for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i]+",");
        }*/

    }

    public static void insert0(int index, int e, int[] ary) throws Exception {
        int[] newAry = new int[ary.length+1];
        System.arraycopy(ary,0, newAry, 0, ary.length);
        int temp = ary[index];
        newAry[index] = e;
        newAry[newAry.length-1] = temp;
        for (int i = 0; i < newAry.length; i++) {
            System.out.print(newAry[i]+",");
        }
        //newAry[newAry.length-1] = temp;
    }

    public static void insert(int index, int e, int[] ary) throws Exception {
        if(index >= ary.length) {
            throw new Exception("索引不在数组范围内");
        }
        int[] newAry = new int[ary.length+1];
        System.arraycopy(ary,0, newAry,0,index);
        newAry[index] = e;
        System.arraycopy(ary, index, newAry, index+1, ary.length-index);
        //Arrays.copyOfRange()


       /* int[] newAry = new int[ary.length+1];
        newAry[index] = e;
        for (int i = 0; i < index; i++) {
            newAry[i] = ary[i];
        }
        for (int k = index+1; k  <= ary.length; k ++) {
            newAry[k]  = ary[k-1];
        }*/

        for (int i = 0; i < newAry.length; i++) {
            System.out.print(newAry[i]+",");
        }
    }

}
