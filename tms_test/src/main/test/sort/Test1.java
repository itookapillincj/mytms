package sort;/*
 *ClassName:Test1
 *UserName:小阎王丷
 *CreateTime:2020/10/28 15:43
 */

public class Test1 {
    public static void bubble(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[i]>arr[j]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
  public static void main(String[] args) {
          int[] arr={2,3,1,4,7,8,6,9};
          bubble(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
