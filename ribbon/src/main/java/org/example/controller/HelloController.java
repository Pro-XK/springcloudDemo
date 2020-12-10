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
 * @date 2020/12/10 9:43
 */
@RestController
public class HelloController {
	@Autowired	//依赖注入
	private HelloService helloService;

	@RequestMapping("/hello")
	public String hello(String name){
		//调用Service接口，并返回JSON数据
		return helloService.obtainOtherServiceData(name);
	}
}
