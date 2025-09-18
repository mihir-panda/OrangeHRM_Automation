package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeClass
    public void setup() {
        System.out.println("Setup Browser");
    }

    @Test
    public void testLogin() {
        System.out.println("Executing login test");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Closing Browser");
    }

}
