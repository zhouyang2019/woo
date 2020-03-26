# woo

# 前言

woo项目是一个spring cloud学习项目，暂时没有实际业务逻辑。

有spring boot的基础，上手spring cloud感觉很顺滑，就是一堆组件拼装在一起，eurekaserver、configserver、feignClient、hystric等，简单的配置之后就可以运行。

# 项目结构

* woo-eureka：服务注册中心，@EnableEurekaServer
* woo-config：配置服务器，@EnableConfigServer
* woo-hystric：断路器监控，@EnableHystrixDashboard，使用@EnableTurbine聚合监控
* woo-zuul：网关，@EnableZuulProxy
* woo-admin：监控服务，@EnableAdminServer
* woo-common：公共模块
* woo-core：业务模块的核心依赖包
* woo-oauth：oauth鉴权服务

# 部署

* Eureka注册中心：http://localhost:8761/
* Admin监控中心：http://localhost:9301/
* Config配置中心：http://localhost:8801/
* RabbitMQ：http://localhost:15672/
* Zipkin：http://localhost:9411/
* hysteric：http://localhost:8802/hystrix



# 参考文章：

* [Spring Cloud Tutorial](https://www.baeldung.com/spring-cloud-series)
* [Spring Cloud 系列教材](https://how2j.cn/k/springcloud/springcloud-intro/2035.html?p=4923)









