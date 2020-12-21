package sort;/*
 *ClassName:Test2
 *UserName:小阎王丷
 *CreateTime:2020/10/29 14:34
 */

public class Test2 {
    //插入排序
    public static void insertSort(int[] arr){
        if (arr.length<=1)return;
        for (int i = 1; i <arr.length ; i++) {
            int t=arr[i];
            int j = i-1;
            for (; j >=0 ; j--) {
                if (arr[j]<t){
                   arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=t;
        }
    }

    public static void main(String[] args) {
        int [] arr= {11,10,5,6,4,1,8};
        insertSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
