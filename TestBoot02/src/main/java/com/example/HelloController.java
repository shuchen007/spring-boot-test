package com.example;

import com.entity.User1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sunhao
 * @Description
 * @Date 11:25 2018/5/25
 * @Modified by
 */

@RestController
public class HelloController {

	@RequestMapping("/1")
	public String index(){
		return "hello world!23";
	}
	@RequestMapping("/user")
	public User1 index1(){
		User1 user1 = new User1();
		user1.setId("fd");
		user1.setAge(23);
		user1.setName("sun");
		return user1;
	}
}
