package org.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample3 {
@Test
private void tc0() {
     String s="kannan";
     System.out.println(s);
     Assert.assertEquals("kannan", s);
     System.out.println("assertfail");
}
}
