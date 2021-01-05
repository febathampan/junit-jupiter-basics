package io.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void test() {
	System.out.println("Test Method Ran at:"+ Instant.now());
	MathUtils mu = new MathUtils();
	assertEquals(11,mu.add(5,6));
	//fail("Not yet implemented");
    }

}
