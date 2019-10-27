package com.njjhkj.qxm.controller;

import com.njjhkj.qxm.common.HttpClientUtil;
import com.njjhkj.qxm.common.JSONResult;
import com.njjhkj.qxm.common.JsonUtils;
import com.njjhkj.qxm.dto.WxEntity;
import com.njjhkj.qxm.entity.WxSessionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: IntelliJ IDEA
 * @description: 微信登录获取唯一openID
 * @author: King
 * @date: 2019-10-25 15:22
 **/
@Controller
public class WxLoginController {


    /**
     * 微信的账号对象
     */
    @Autowired
    private WxEntity wxEntity;
    /**
     * 根据code获取用户的openID
     */
    @RequestMapping("/wxLogin")
    public JSONResult wxLogin(String code, HttpServletRequest request,
                              HttpServletResponse response) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String, String> param = new HashMap<>();
        param.put("appid", wxEntity.getAppId());
        param.put("secret", wxEntity.getAppSecret());
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");
        String wxResult = HttpClientUtil.doGet(url, param);
        WxSessionModel model = JsonUtils.jsonToPojo(wxResult, WxSessionModel.class);
        return JSONResult.ok(model);
    }
}
