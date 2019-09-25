# SpringcloudDemo
* 微服务架构 SpringCloud
### Eureka Service
* 服务注册、发现
* module: spring-cloud-eureka-server
* 地址：http://localhost:8761/

### Eureka Client
#### user 服务
* 业务： user 服务
* module: spring-cloud-eureka-user
* 地址：http://localhost:8080/findOrderByUser/1


#### order 服务
* 业务： order 服务
* module: spring-cloud-eureka-order
* 地址：http://localhost:7900/order/1
* 地址：http://localhost:7901/order/1

### Ribbon
* 作用：客户端负载均衡（指业务微服务的负载均衡）
* module: spring-cloud-eureka-user
* module: spring-cloud-eureka-user-hystrix
* 地址：http://localhost:8080/findOrderByUser/1
* 地址：http://localhost:8030/findOrderByUser/1
* 通过在注解 ```@LoadBalanced``` 实现负载均衡

### hystrix
* 断路器
* module: spring-cloud-eureka-user-hystrix
* 地址： http://localhost:8030/hystrix.stream

### hystrixdashboard
* 断路器监控页面
* module: spring-cloud-hystrix-dashboard
* 地址： http://localhost:8031/hystrix

### Zuul
* Api 网关
* module:
* 地址：http://localhost:8050
* 备注：Zuul 与 Eureka Client 整合的方式使用，具体的 url 交由 Eureka 来维护管理
* 通过 gateway 配置了路由器访问业务层地址：
   *  http://localhost:8050/spring-cloud-eureka-order/order/1
   *  http://localhost:8050/spring-cloud-eureka-user-hystrix/findOrderByUser/1
   *  http://localhost:8050/spring-cloud-eureka-user/findOrderByUser/1

