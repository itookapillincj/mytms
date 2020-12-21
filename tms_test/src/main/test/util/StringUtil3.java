package util;/*
 *ClassName:StringUtil3
 *UserName:小阎王丷
 *CreateTime:2020/9/15 16:38
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringUtil3 {
    public static void main(String[] args) {
        String str4="If you If think   that   Maven could  help your project, you can find out more information in the \"About Maven\"  section of the navigation. This includes an in-depth description of what Maven is and a list of some of its main features.";
        String str5 = str4.replaceAll("[^a-zA-Z]"," ");
        String str1="";
        String[] char5 = str5.split("\\s+");
        for (int j = 0; j <char5.length; j++) {
            String s=char5[j];
            if (str1.indexOf(s)==-1){
                int count = 0;
                for (int i = 0; i < char5.length; i++) {
                    if (char5[i].equals(s)) {
                        count++;
                    }
                }
                System.out.println(s + ":" + count);
                str1+=s;
            }
            }
        }
    }

