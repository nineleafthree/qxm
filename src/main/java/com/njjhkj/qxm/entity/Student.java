package com.njjhkj.qxm.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private int age;
}
