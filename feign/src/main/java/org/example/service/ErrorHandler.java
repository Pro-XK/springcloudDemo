package org.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * TODO 熔断处理类
 *
 * @author kexur
 * @version 1.0
 * @date 2020/12/10 11:22
 */

@Component
public class ErrorHandler implements HelloService {
	@Value("${server.port}")
	private String port;

	@Override
	public String obtainOtherServerJsonData(String name) {
		return "sorry " + name + " , " + port + " server internal error";
	}
}
