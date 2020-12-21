package array;/*
 *ClassName:FbArray
 *UserName:小阎王丷
 *CreateTime:2020/10/10 16:28
 */

public class FbArray {
    int sum = 0;
    public static void main(String[] args) {
        //求10的阶层

        System.out.println(f(5));
        System.out.println(fb(6));
        FbArray fb=new FbArray();
        fb.fc(3,2);
        System.out.println(fb.sum);
        int [] ary={1,2,3,4,5,6,7,8};
        fb.digui(ary,0,ary.length-1);
    }
    public static int f(int n){
        if (n==1)return 1;
        return n*f(n-1);
    }
    public static int fb(int n){
        if (n==1||n==2)return 1;
        return fb(n-1)+fb(n-2);
    }
    public void fc(int a, int k) {

        sum++;
        if (a == 0) {
            return;
        }
        for (int i = 1; i <=k ; i++) {
          fc(a-1,k);
        }
        return ;
    }
      public void digui(int[] ary,int left,int right){
          printArr(ary, left, right);
          int mid=(left+right)/2;
         if (left>=right)return;
          digui(ary,left,mid);
          digui(ary,mid+1,right);
      }
     public void printArr(int[] ary,int left,int right ){
         for (int i = left; i <=right ; i++) {
             System.out.print(ary[i]);
         }
         System.out.println();
     }
    }

