package com.example.api.junittestcases;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitTestCasesApplicationTests {



	@Test
	public void contextLoads() {
			Calculator calculator=new Calculator();
			int output=calculator.add(10,20);
			Assert.assertEquals(30,output);
	}

}
