package cn.smbms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestJspController {
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("======hello=====");
		return "hello";
	}
}
