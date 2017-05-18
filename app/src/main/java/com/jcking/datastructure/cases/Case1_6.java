package com.jcking.datastructure.cases;

/**
 * 编写带有下列声明的例程：
 * public void permute(String str);
 * private void permute(char[] str, int low, int high);
 * 第一个例程是个驱动程序，它调用第二个例程并显示String str中的字符的所有排列。
 * 如果str是"abc"，那么输出的串则是abc,acb,bac,bca,cab和cba。第二个例程使用递归
 *
 * @author Jcking
 * @time 2017/5/17 18:54
 */
public class Case1_6 extends BaseCase {

    public void permute(String str){
        if(str == null || str.length() == 0)
            println("Can not permute an empty string !");
        else
            permute(str.toCharArray(), 0, str.length());
    }

    private void permute(char[] str, int low, int high){
        int length = str.length;
        if(low >= length || high <= 0 || low >= high) {
            println("Illegal low and high !");
            return;
        }

        if(high-low == 1){
            println(String.valueOf(str));
            return;
        }

        char oldI, oldLow = str[low];
        for(int i=low; i<high; i++){
            oldI    = str[i];

            str[i]  = oldLow;
            str[low]= oldI;
            permute(str, low+1, high);
            str[i]  = oldI;
            str[low]= oldLow;
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Case1_6 case1_6 = new Case1_6();
        case1_6.permute("abcdefghij");
        System.out.println("" + (System.currentTimeMillis()-start));
    }
}
