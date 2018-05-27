package com.sun.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sunhao
 * @Description
 * @Date 9:55 2018/5/25
 * @Modified by
 */
@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class SampleController {
	@Value("${person.name}")
	private String name;
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!"+name;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}
