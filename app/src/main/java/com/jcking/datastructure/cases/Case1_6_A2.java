package com.jcking.datastructure.cases;

/**
 * 编写带有下列声明的例程：
 * public void permute(String str);
 * private void permute(char[] str, int low, int high);
 * 第一个例程是个驱动程序，它调用第二个例程并显示String str中的字符的所有排列。
 * 如果str是"abc"，那么输出的串则是abc,acb,bac,bca,cab和cba。第二个例程使用递归
 *
 * 这个是在网上找到的另一种解法，实现起来比我的简单，但是数据大的时候，效率会比我的慢一点（其实我的也会很慢），
 * 毕竟这种方法是用的String，比char慢一些
 *
 * @author Jcking
 * @time 2017/5/18 11:53
 */
public class Case1_6_A2 {

    static int c = 0;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = "abcdefghij";
        printAllArray(s);
        System.out.println("" + (System.currentTimeMillis()-start));
    }

    private static void printAllArray(String s) {
        printAllArray(s, "");
    }

    private static void printAllArray(String s, String n) {
        if (s.length() == 0) {
            System.out.println(n);
        } else {
            for (int i = 0; i < s.length(); ++i) {
                printAllArray(s.substring(1), n + s.charAt(0));
                s = s.substring(1) + s.charAt(0);
            }
        }
    }
}
