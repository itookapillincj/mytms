package hash;/*
 *ClassName:CartHash
 *UserName:小阎王丷
 *CreateTime:2020/10/16 11:17
 */


import java.util.HashMap;

public class CartHash {
    public static void main(String[] args) {
        HashMap<String,Cart> hs=new HashMap<>();
        String[] flower={"黑","红","梅","方"};
        String[] face={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int k=1;
        for (int i = 0; i <4 ; i++) {
        for (int j = 0; j <face.length ; j++) {
            Cart c1=new Cart(flower[i],face[j]);
            hs.put(k+"",c1);
            k++;
        }
    }
        Cart cart1=new Cart("大王");
        Cart cart2=new Cart("小王");
        hs.put("53",cart1);
        hs.put("54",cart2);
        System.out.print(hs);
    }
}
