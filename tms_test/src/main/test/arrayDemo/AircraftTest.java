package arrayDemo;/*
 *ClassName:AircraftTest
 *UserName:小阎王丷
 *CreateTime:2020/9/22 14:44
 */

import java.util.ArrayList;
import java.util.Random;

public class AircraftTest {
    public static void main(String[] args) {
        ArrayList<Aircraft> list=new ArrayList(){};
        Random r=new Random();

        for (int i = 0; i <100 ; i++) {
            int hp=r.nextInt(100);
            int x=r.nextInt(300);
            int y=r.nextInt(300);
            Aircraft air=new Aircraft(100,x,y,hp);
            list.add(air);
        }
        for (int j = 0; j < 5; j++) {
            int i=r.nextInt(100);
            System.out.println(list.get(i));
        }
    }
}
