package com.njjhkj.qxm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: King
 * @date: 2019-10-27 16:06
 **/
@Data
public class Fwxm implements Serializable {

    private Integer id;
    private String nameFwxm;
    private String idFwxm;
    private Integer prize;
}
