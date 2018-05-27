package com.sun.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleControllerTests {
	@Autowired
	Person person;
	@Test
	public void contextLoads() {
		System.out.println("do1");
		System.out.println(person);
		System.out.println("do2");
	}
}
