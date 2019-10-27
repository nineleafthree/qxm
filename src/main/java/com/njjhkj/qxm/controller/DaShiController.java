package com.njjhkj.qxm.controller;

import com.njjhkj.qxm.common.JSONResult;
import com.njjhkj.qxm.entity.Fwxm;
import com.njjhkj.qxm.service.DaShiService;
import com.njjhkj.qxm.service.impl.DaShiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @program: IntelliJ IDEA
 * @description: 服务项目
 * @author: King
 * @date: 2019-10-25 15:22
 **/
@RestController
public class DaShiController {

    @Autowired
    private DaShiService daShiServiceImpl;

    /**
     * 获取大师的所有服务项目
     * @return JSONResult
     */

    @RequestMapping(value="/getFwxmAll",produces="application/json;charset=UTF-8")
    public JSONResult getFwxmAll() {
        List<Fwxm> list = daShiServiceImpl.getFwxmAll();
        System.out.println(list.toString());
        return JSONResult.ok(list);
    }
}
