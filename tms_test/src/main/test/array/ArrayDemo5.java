package array;

/*
    a={10, 15, 17, 19, 1, 3, 5, 7}
    将a分为left和right两部分，这两部分是有序的
    要求将整个数组变成有序的
 */

public class ArrayDemo5 {


    public static void main(String[] args) {

        int[] arr={10, 15, 17, 19,  1, 3, 20, 21};
        int[] temp = new int[arr.length];

        int i = 0, k=0;
        int mid = (arr.length-1) >> 1;
        int j = mid+1;

        while(i<=mid && j<arr.length) {
            if(arr[i] > arr[j]) {
                temp[k] = arr[j];
                j++;
            }
            else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

//        int start = i, end = mid;
//
//        if(j<=arr.length) {
//            start = j;
//            end = arr.length;
//        }
//        while(start<end) {
//            temp[k] = arr[start];
//            k++;
//            start++;
//        }

        while(i<=mid) {
            temp[k] = arr[i];
        k++;
        i++;
    }

        while(j<arr.length) {
        temp[k] = arr[j];
        k++;
        j++;
    }

        System.out.println("i="+i + ", j=" + j);


        for (int l = 0; l < temp.length; l++) {
            System.out.print(temp[l]+",");
        }


    }

}
