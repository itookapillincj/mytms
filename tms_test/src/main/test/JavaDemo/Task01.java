package JavaDemo;

public class Task01 {
    public static void main(String[] args) {
        int s_num=100;//开始值
        int e_num=999;//结束值
        int j;
        for (int i = s_num; i <=e_num ; i++) {
            for ( j = 2; j <=i; j++) {
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.println(i);
            }
        }
    }
}
