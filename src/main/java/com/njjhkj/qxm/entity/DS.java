package com.njjhkj.qxm.entity;
import	java.sql.Timestamp;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: 大师信息实体类（包含个人详细信息，以及服务项目、服务项目价位）
 * @description:
 * @author: King
 * @date: 2019-10-27 16:06
 **/
@Data
public class DS implements Serializable {

    private Integer id;
    private String openid;
    private String dsId;
    private String name;
    private String introduce;
    private String comment;
    private String coverImgUrl;
    private String dsSc;
    private Integer state;
    private Timestamp createTime;
    private Timestamp releaseTime;
    private String imgTx;
    private String imgDt;
    private Integer tj;
    private Integer numberDd;
    private Integer hfTime;
    private List<Fwxm> dsFwxm;

}
