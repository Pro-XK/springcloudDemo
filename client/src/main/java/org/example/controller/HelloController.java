package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author kexur
 * @version 1.0
 * @date 2020/12/9 17:40
 */
@RestController //相当于同时加上了@Controller和@ResponseBody，传输json数据
public class HelloController {
	@Value("${server.port}")
	private String port;
	@RequestMapping("/hi")
	public String sayHello(String name){
		return "hi,"+name+ " , I am " + port + " port";
	}
}
