package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    public void testMethInClassA() {
        A objA = new A();
        String result = objA.meth();
        assertEquals("Invoking method from class A", result);
    }

    @Test
    public void testMethInClassB() {
        B objB = new B();
        String result = objB.meth();
        assertEquals("Method is overridden in Extended class B", result);
    }
}
