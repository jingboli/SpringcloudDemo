package cc.lijingbo.hystrix.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("findOrderByUser/{id}")
    @HystrixCommand(fallbackMethod = "fallbackInfo")
    public String findOrdersByUser(@PathVariable String id) {
        return this.restTemplate.getForObject("http://spring-cloud-eureka-order/order/" + id, String.class);
    }

    /**
     * 返回信息方法
     *
     * @param id
     * @return
     */
    public String fallbackInfo(@PathVariable String id) {
        return "服务不可以，请稍后重试";
    }
}