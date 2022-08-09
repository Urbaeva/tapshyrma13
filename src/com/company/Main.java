package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
	    Class klass = new Class(5, "write", nums);
        System.out.println(klass.getNumber());
        System.out.println(klass.getWord());
        System.out.println(Arrays.toString(klass.getArray()));
    }
}
