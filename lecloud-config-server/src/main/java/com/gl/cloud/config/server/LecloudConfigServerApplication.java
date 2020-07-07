package com.gl.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 */
@EnableConfigServer
@SpringBootApplication
public class LecloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LecloudConfigServerApplication.class, args);
    }

}
