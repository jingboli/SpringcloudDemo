package cc.lijingbo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplcation {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplcation.class, args);
    }
}
