package com.mzgo.todayantapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.mzgo.todayantapi.config.properties.AppProperties;
import com.mzgo.todayantapi.config.properties.CorsProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        CorsProperties.class,
        AppProperties.class
})
public class TodayAntApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodayAntApiApplication.class, args);
    }

}
