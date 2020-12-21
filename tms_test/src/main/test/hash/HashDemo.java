package hash;/*
 *ClassName:HashDemo
 *UserName:小阎王丷
 *CreateTime:2020/10/18 14:54
 */

public class HashDemo {
    public static void main(String[] args) {
        for (int i = 2; i <100 ; i++) {
            for (int j = 2; j<=(int)Math.sqrt(i) ; j++) {
                if (i%j==0) {
                   break;
                }
                if (j>Math.sqrt(i)){
                    System.out.println(i);
              }
           }
        }
    }
}
