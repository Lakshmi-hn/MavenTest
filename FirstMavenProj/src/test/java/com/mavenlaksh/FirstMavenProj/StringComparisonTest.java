package com.mavenlaksh.FirstMavenProj;
//import static org.junit.Assert.*;
//import org.junit.*;
import junit.framework.TestCase;

public class StringComparisonTest extends TestCase {
	public void test(){
		StringComparison sc = new StringComparison();
		assertTrue("Helo and Hello fails", (sc.compare("Hello", "Hello"))); 
		
	}
	
}
