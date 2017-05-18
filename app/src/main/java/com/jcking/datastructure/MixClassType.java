package com.jcking.datastructure;

/**
 * @author Jcking
 * @time 2017/5/17 16:09
 */
public class MixClassType {

    static class Base{}

    static class BaseA extends Base{

    }

    static class BaseB extends Base{

    }

    public static void main(String[] args) {
        Base[] list = {new BaseA(), new BaseA(), new BaseA()};
        list[0] = new BaseB();
        for(int i=0; i<list.length; i++)
            System.out.println(list[i].getClass().toString() + " --> " + i + "\n");
    }
}
