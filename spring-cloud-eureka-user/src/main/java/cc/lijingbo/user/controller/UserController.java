package cc.lijingbo.user.controller;

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
    public String findOdersByUser(@PathVariable String id) {
        return this.restTemplate.getForObject("http://spring-cloud-eureka-order/order/" + id, String.class);
    }
}
