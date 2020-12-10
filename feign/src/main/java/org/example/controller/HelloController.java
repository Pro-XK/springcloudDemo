package org.example.controller;

import org.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author kexur
 * @version 1.0
 * @date 2020/12/10 9:11
 */
@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;
	@RequestMapping("/hello")
	public String sayHello(String name){
		return helloService.obtainOtherServerJsonData(name);
	}
}
