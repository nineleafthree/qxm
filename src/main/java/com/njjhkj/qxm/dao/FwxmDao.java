package com.njjhkj.qxm.dao;

import com.njjhkj.qxm.entity.Fwxm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("fwxmDao")
@Mapper
public interface FwxmDao {
    List<Fwxm> selectFwxmAll();
}
