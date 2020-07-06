package com.gl.cloud.lecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * (eureka自我保护机制)
 * Eureka Server 在运行期间会去统计心跳失败比例在 15 分钟之内是否低于 85%，
 * 如果低于 85%，Eureka Server 会将这些实例保护起来，让这些实例不会过期，
 * 但是在保护期内如果服务刚好这个服务提供者非正常下线了，此时服务消费者就会拿到一个无效的服务实例，
 * 此时会调用失败，对于这个问题需要服务消费者端要有一些容错机制，如重试，断路器等。
 * 我们在单机测试的时候很容易满足心跳失败比例在 15 分钟之内低于 85%，
 * 这个时候就会触发 Eureka 的保护机制，一旦开启了保护机制，则服务注册中心维护的服务实例就不是那么准确了, 关闭保护机制可以确保注册中心中不可用的实例被及时的剔除
 */
@EnableEurekaServer
@SpringBootApplication
public class LecloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LecloudEurekaApplication.class, args);
    }

}
