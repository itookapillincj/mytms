package hash;/*
 *ClassName:ArrayHashMap
 *UserName:小阎王丷
 *CreateTime:2020/10/16 11:41
 */

import java.util.HashMap;

public class ArrayHashMap {
    public static void main(String[] args) {
        int r=15;
        int [] arr={10,8,11,12,1,3,5,16};
        int j=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            hs.put(arr[i],i);
        }
        while (true){
            int m=r-arr[j];
            Integer index=hs.get(m);
        }
    }
}
