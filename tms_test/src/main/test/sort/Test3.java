package sort;/*
 *ClassName:Test3
 *UserName:小阎王丷
 *CreateTime:2020/10/29 15:04
 */

public class Test3 {
    public static void main(String[] args) {
        int [] arr={5,8,6,4,2,1};
        for (int i = 0; i <arr.length ; i++) {
            int index=i ;
            for (int j = i+1; j <arr.length; j++) {
                if (arr[j] <arr[index]) {
                    index= j;
                }

            }

                int t=arr[i];
                arr[i]=arr[index];
                arr[index]=t;
            }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
