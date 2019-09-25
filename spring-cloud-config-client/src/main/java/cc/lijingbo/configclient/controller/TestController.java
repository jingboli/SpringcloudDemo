package cc.lijingbo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${clientParam}")
    private String clientParam;

    @RequestMapping("/clientParam")
    public String getParam() {
        return this.clientParam;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
