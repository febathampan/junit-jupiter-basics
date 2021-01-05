package io.junit.test;

import java.time.Instant;

public class MathUtils {
public int add(int a, int b) {
    System.out.println("Actual method ran now:"+ Instant.now());   
    return a+b; 
}
}
