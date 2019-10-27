package com.njjhkj.qxm.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: King
 * @date: 2019-10-27 15:36
 **/
@Data
@Component
@PropertySource("classpath:wx.properties")
@ConfigurationProperties("wx")
public class WxEntity implements Serializable {
    private String appId;
    private String appSecret;
}
