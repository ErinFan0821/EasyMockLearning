package com.mock.src;

/**
 * Created by techops on 4/9/14.
 */
public class Knight {
    void ImVoid() {
        System.out.print("I returns void");
    }

    String returnString() {
        String ret = "I returns string";
        System.out.print(ret);
        return ret;
    }

    String willThrowException() {
        return "";
    }
}