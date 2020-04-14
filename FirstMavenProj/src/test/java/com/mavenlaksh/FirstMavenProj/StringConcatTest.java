package com.mavenlaksh.FirstMavenProj;

import junit.framework.TestCase;

public class StringConcatTest extends TestCase {
	
	 public void testConcatenate() {
		 StringConcat sc = new StringConcat();

        String result = sc.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
