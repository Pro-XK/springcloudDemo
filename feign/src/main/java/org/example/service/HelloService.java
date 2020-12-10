package org.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO
 *
 * @author kexur
 * @version 1.0
 * @date 2020/12/10 9:07
 */
@FeignClient(value = "SERVICE-CLIENT",fallback = ErrorHandler.class)   //value用于服务发现，寻找名称为service-client的服务,fallback用于熔断返回调用的处理类
public interface HelloService {
	/**
	 * 从SERVICE-CLIENT服务器的/hi接口获取JSON数据
	 * @param name
	 * @return
	 */
	@RequestMapping("/hi")
	 String obtainOtherServerJsonData(@RequestParam(value = "name") String name);

}
