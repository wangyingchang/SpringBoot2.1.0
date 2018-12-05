package com.test.springboot210.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import static org.springframework.web.cors.CorsConfiguration.ALL;

/**
 * @author Time
 * @date 2018-12-04 17:13
 * @desc 支持跨域,可以直接在controller类添加下面注解
 * //@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
 */
@Configuration
public class MyCorsConfig {
    /**
     * 允许任何域名使用
     * 允许任何头
     * 允许任何方法（post、get等）
     */
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin(ALL);
        corsConfiguration.addAllowedHeader(ALL);
        corsConfiguration.addAllowedMethod(ALL);
        return corsConfiguration;
    }
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}
