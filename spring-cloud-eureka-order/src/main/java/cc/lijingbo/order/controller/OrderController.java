package cc.lijingbo.order.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import cc.lijingbo.order.ServiceInfoUtils;
import cc.lijingbo.order.domain.Order;

@RestController
public class OrderController {

    @RequestMapping("/order/{id}")
    public String findOrderById(@PathVariable String id) {
        Order order = new Order();
        order.setId("123");
        order.setPrice(23.5);
        order.setReceiverAddress("Beijing");
        order.setReceiverName("xiaoqiang");
        order.setReceiverPhone("13222343311");
        System.out.println(ServiceInfoUtils.getPort());
        return order.toString();
    }

}
