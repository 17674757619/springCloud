package demo;

import com.didispace.swagger.butler.EnableSwaggerButler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
//swagger注解
@EnableSwaggerButler
public class ServiceZuulSwaggerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceZuulSwaggerApplication.class, args);
    }

}
