package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO
 *
 * @author kexur
 * @version 1.0
 * @date 2020/12/9 17:27
 */
@EnableEurekaServer
@SpringBootApplication
public class AppStarter {
  public static void main(String[] args) {
	  SpringApplication.run(AppStarter.class,args);
  }
}
