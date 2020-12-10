package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * TODO
 *
 * @author kexur
 * @version 1.0
 * @date 2020/12/9 17:35
 */
@SpringBootApplication
@EnableEurekaClient //表明这是一个服务提供者
public class ClientStarter {
  public static void main(String[] args) {
	  SpringApplication.run(ClientStarter.class,args);
  }
}
