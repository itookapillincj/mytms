package aryadd;/*
 *ClassName:AddValue
 *UserName:小阎王丷
 *CreateTime:2020/9/22 15:17
 */

public class AddValue {
    public static void main(String[] args) {
        int[] ary={1,2,3,4,5,6};
        int[] new_ary=insert(ary,7,0);
        for (int i = 0; i <new_ary.length ; i++) {
            System.out.print(new_ary[i]+",");
        }

    }
    private static int[] insert(int[] ary,int a,int index){
        if (index>=ary.length){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        int length=ary.length;
        int new_ary[]=new int[length+1];
        System.arraycopy(ary, 0, new_ary, 0, index);
        new_ary[index]=a;
        System.arraycopy(ary, index, new_ary, index+1, length-index);
        return new_ary;
    }
}
