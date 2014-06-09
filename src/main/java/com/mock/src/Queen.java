package com.mock.src;

/**
 * Created by techops on 4/9/14.
 */

public class Queen {
    private Knight knight;

    void callVoidFunc() {
        knight.ImVoid();
    }

    String callStringFunc() {
        return knight.returnString();
    }

    void callExceptionFunc() {
        try {
            knight.willThrowException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void set(Knight knight) {
        this.knight = knight;
    }
}
