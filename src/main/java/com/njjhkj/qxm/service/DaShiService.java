package com.njjhkj.qxm.service;

import com.njjhkj.qxm.entity.DS;
import com.njjhkj.qxm.entity.Fwxm;

import java.util.List;
import java.util.Map;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: King
 * @date: 2019-10-27 15:57
 **/
public interface DaShiService {

    List<Fwxm> getFwxmAll();
    DS getDSByDsId(String dsId);
}
