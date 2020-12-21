package array;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] i_ary_1 = {1,3,5,7,9};
        int[] i_ary_2 = new int[8];
        int[] i_ary_3 = new int[]{2,4,6,8,10};
        int[] i_ary_4;
        i_ary_4 = new int[5];

        /*
            i_ary_1   1000~1003   [0]
                      1004~1007   [1]
                      1008~1011   [2]
                      1012~1015   [3]
                      1016~1019   [4]

            数组的名称代表数组的首地址
            1000 + size(int)*2    1008
            1000 + size(int)*4    1016
         */
        System.out.println( i_ary_1[2] );

        char[] ch_ary_1 = {'A','C','E'};
        char[] ch_ary_2 = new char[]{'A','C','E'};

        char[] ch_ary_3 = new char[6];
        ch_ary_3[0] = 'X';
        ch_ary_3[1] = 'Y';

        String[] s_ary_1 = {"Jack", "Tom", "Jerry"};
        String[] s_ary_2 = new String[2];
        String[] s_ary_3 = new String[]{"","",""};

        //Integer inte = new Integer(4);
        //Character cha = new Character('A');
        Object[] o_ary_1 = {4, "hello", 'A', 2.541f, true, new Student()};
        Object[] o_ary_2 = new Object[10];// 0 ~ 9
        for (int i = 0; i < o_ary_2.length; i++) {
            o_ary_2[i] = Math.random();
        }
        Object[] new_o_ary = new Object[o_ary_2.length*2+2];
        System.arraycopy(o_ary_2,0,new_o_ary,0, o_ary_2.length);
        new_o_ary[10] = Math.random();


        Object[] o_ary_3 = new Object[]{};
        Student[] stu_ary_1 = {new Student(), new Student(), new Student()};
        Student[] stu_ary_2 = new Student[5];
        stu_ary_2[0] = new Student();
        stu_ary_2[1] = new Student();

        Student[] stu_ary_3 = new Student[]{new Student(), new Student()};


    }
}

class Student {

}
