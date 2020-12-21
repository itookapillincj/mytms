package util;/*
 *ClassName:StringUtil
 *UserName:小阎王丷
 *CreateTime:2020/9/15 9:51
 */

public class StringUtil {
    public static void main(String[] args) {

        String s1 = "我爱你中国";
        char[] char1 = new char[]{'H', 'E', 'L', 'L', 'O'};
        String str1 = new String(char1, 3, 2);
        System.out.println(str1);
        //定义字节数组
        byte[] byte1=new byte[]{65,66,67};
        String str3=new String(byte1,0,byte1.length);
        System.out.println(str3);
                byte[] by= s1.getBytes();
        for (int i = 0; i <by.length ; i++) {
            System.out.println(by[i]);
        }//e68891 我，//
        //将字符串转换成字符数组
        String str2="ssadgdsgdsgasds";

        for (int i = 0; i <str2.length() ; i++) {
            if (i==0){
                System.out.print("["+str2.charAt(i)+",");
            }else
                if (i == str2.length()-1) {
                    System.out.print("]");
                 } else {
                    System.out.print(str2.charAt(i)+",");
                }

            System.out.println();
        }
        String str4="asdfghasydgh";
        String str6="";

        for (int j = 0; j <str4.length(); j++) {
            char char5 = str4.charAt(j);
            if (str6.indexOf(char5)==-1){
            int count = 0;
            for (int i = 0; i < str4.length(); i++) {
                if (str4.charAt(i) == char5) {
                    count++;
                }
            }
                System.out.println(char5 + ":" + count);
                str6+=char5;
            }
        }
        System.out.println("================================");
        int count=0;
        int proindex=-1;
         while (true) {
             proindex= str4.indexOf('a',proindex+1);
              if (proindex==-1){
                  break;
              }
            count++;
        }
        System.out.println(count);
         String a="cuijian";
         String b="cuijian";
        String str="cuijian";

         boolean bool=a.equals(b);
        System.out.println(bool);
        System.out.println(a==b);
       String c= a.concat(b);//字符串拼接
        System.out.println(c);
      String d= a.replaceAll("cui","cj");//字符串替换
        System.out.println(d);//字符替换
     String e= b.replace('c','b');
        System.out.println(e);
       boolean b2= str.contains("cui");
        System.out.println(b2);
    }


    }

