  package str;

public class StringBufferDemo {

    public static final char[] chars = new char[20];



    public static void main(String[] args) {


        System.out.println(chars[0]);

        String s1 = "我是Tom";
        String s2 = new String("我是Tom");
        String s3 = new String(new byte[]{2,4,6});
        String s4 = new String(new char[]{65,66, 'C'});

        // 可变字符串  StringBuffer 父类 AbstractStringBuilder
        StringBuffer sb = new StringBuffer();

        sb.append("Hello");
        sb.append("world");
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("java and javascript");
        System.out.println(sb.capacity());
        sb.append("java and javascript");
        System.out.println(sb.capacity());
        sb.append("java and javascript");
        System.out.println(sb.capacity());
        sb.append("java and javascript");
        System.out.println(sb.capacity());

        char[] chs = new char[8];
        for (int i = 65,j=0; j<4 ; j++,i++) {
            chs[j] = (char)i;
        }

        chs = insert(2, 'K', chs);
        System.out.println(chs);
        //编写一个函数，传入一个索引和字符，将字符插入到数组索引所在的位置

        //数组的复制
        //定义两个数组，实现复制
        /*char[] o_ary = new char[]{'A','B','C','D'};
        char[] d_ary = new char[10];

        System.arraycopy(o_ary, 0, d_ary, 0, o_ary.length);
        System.out.println(d_ary);
        sb.insert(1, 'M');*/


        sb.delete(0,5);
        System.out.println(sb.toString());
        sb.setCharAt(1, 'F');



    }

    public static char[] insert(int index, char ch, char[] chs) {
        //System.out.println(chs[1]=='\0');
        char[] t_ary = new char[chs.length*2+2];
        System.arraycopy(chs, index, t_ary, index + 1, chs.length - index);
        t_ary[index] = ch;
        return t_ary;
    }
}
