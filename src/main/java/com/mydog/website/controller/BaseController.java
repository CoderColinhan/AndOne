package com.mydog.website.controller;

import com.mydog.entity.TUsers;
import com.mydog.website.utils.MapCache;
import com.mydog.website.utils.TableUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

public abstract class BaseController {

    public static String THEME = "themes/default";

    protected MapCache cache = MapCache.single();

    /**
     * 主页的页面主题
     */
    public String render(String viewName){
        return THEME + File.separator + viewName;
    }

    public BaseController title(HttpServletRequest request, String title){
        request.setAttribute("title", title);
        return this;
    }

    public BaseController keywords(HttpServletRequest request, String keywords) {
        request.setAttribute("keywords", keywords);
        return this;
    }

    /**
     * 获取请求绑定的登录对象
     */
    public TUsers user(HttpServletRequest request){
        return TableUtils.getLoginUser(request);
    }

    public Integer getUid(HttpServletRequest request){
        return this.user(request).getUid();
    }

    public String render_404(){
        return "comm.error_404";
    }


}
