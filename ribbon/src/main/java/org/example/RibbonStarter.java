package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author kexur
 * @version 1.0
 * @date 2020/12/10 9:35
 */
@SpringBootApplication
@EnableEurekaClient 		//表明这是一个服务提供者
@EnableDiscoveryClient		//表示向服务中心注册
@EnableHystrix				//开启熔断功能
public class RibbonStarter {
  public static void main(String[] args) {
	  SpringApplication.run(RibbonStarter.class,args);
  }
	@Bean
	@LoadBalanced			//表明RestTemplate工具类将会负载均衡
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
