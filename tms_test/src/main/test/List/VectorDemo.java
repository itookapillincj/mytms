package List;/*
 *ClassName:VectorDemo
 *UserName:小阎王丷
 *CreateTime:2020/10/20 9:45
 */

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
    Vector<String> vc=new Vector<>(10,5);
        vc.add("She");
        vc.add("is");
        vc.add("big");
        vc.add("dog");
        vc.add("and");
        vc.add("pig");
        vc.add("one");
        for (int i = vc.size()-1; i>=0 ; i--) {
            vc.remove(i);
        }
        System.out.println(vc);
    }
 }