package com.njjhkj.qxm.dao;

import com.njjhkj.qxm.entity.DS;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component("dsDao")
@Mapper
public interface DSDao {
    DS selectDSByDsId();
}
