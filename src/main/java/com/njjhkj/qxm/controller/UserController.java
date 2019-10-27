package com.njjhkj.qxm.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqy
 */
@RestController
public class UserController {

	 @RequestMapping("/hello")
	 public String home() {
		 return "Hello World!";
	 }

	 
}
