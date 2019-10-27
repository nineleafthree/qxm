package com.njjhkj.qxm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wangqyjs
 */
@Data
public class WxSessionModel implements Serializable {

    private String sessionKey;
    private String openid;
    private String expiresIn;


}
