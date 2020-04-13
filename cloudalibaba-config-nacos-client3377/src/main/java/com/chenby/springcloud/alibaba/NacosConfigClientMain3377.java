package com.chenby.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy InvocationTargetException  OutOfMemoryError: Metaspace
 * @create 2020-02-23 17:01 nginx: [emerg] invalid number of arguments in "proxy_pass" directive in /usr/local/nginx/conf/nginx.conf:51
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377
{
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}
