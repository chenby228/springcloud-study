package com.chenby.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//compiler   unlink    jump to source
//You can not remove cloud-gateway-gateway9527 because it's imported as a module of another project (com.chenby.springcloud:springcloud-study:1.0-SNAPSHOT). You can use Ignore action. Only root project can be removed.
//generate sources and update folders
@Configuration
public class GateWayConfig
{
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_chenby",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }
}
