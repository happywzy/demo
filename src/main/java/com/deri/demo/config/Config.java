package com.deri.demo.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Config
 * @Description: TODO
 * @Author: wuzhiyong
 * @Time: 2021/1/21 19:12
 * @Version: v1.0
 **/
@ConfigurationProperties(prefix = "demo")
@Component
@Data
public class Config {
    private int limit;
    private String xxx;
}
