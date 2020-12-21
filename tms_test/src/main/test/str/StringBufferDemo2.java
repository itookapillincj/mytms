package str;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            //s1 += i;
            s1 = new StringBuilder().append(i).toString();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

        System.out.println("---------------------------------");

        begin = System.currentTimeMillis();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sb1.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - begin);

        System.out.println("---------------------------------");

        begin = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb2.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
