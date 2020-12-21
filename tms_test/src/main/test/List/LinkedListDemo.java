package List;/*
 *ClassName:LinkedList
 *UserName:小阎王丷
 *CreateTime:2020/10/19 10:02
 */

import java.util.LinkedList;
import java.util.Random;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Cart1> link=new LinkedList<>();
        String[] flower={"黑","红","梅","方"};
        String[] face={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <face.length ; j++) {
                Cart1 cart1=new Cart1(flower[i],face[j]);
                link.add(cart1);
            }
        }
        link.add(new Cart1("大王"));
        link.add(new Cart1("小王"));
        System.out.println(link.size());
        System.out.println(link);
        Random r=new Random();
        int k;
        for (int i = 0; i <17 ; i++) {
            k=r.nextInt(54);
            System.out.println(link.get(k));
        }

    }
}
