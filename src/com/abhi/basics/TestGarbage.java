package com.abhi.basics;

import java.io.IOException;

public class TestGarbage {
    TestGarbage() {}
    protected void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) throws IOException {
        TestGarbage testGarbage = new TestGarbage();
        testGarbage = null;
        Runtime.getRuntime().exec("notepad");
        System.gc();
    }
}
