package com.mydog.website.service;

import com.mydog.entity.TUsers;

public interface IUserService {
    /**
     * 保存用户数据
     *
     * @param userVo 用户数据
     * @return 主键
     */

    Integer insertUser(TUsers userVo);

    /**
     * 通过uid查找对象
     * @param uid
     * @return
     */
    TUsers queryUserById(Integer uid);

    /**
     * 用戶登录
     * @param username
     * @param password
     * @return
     */
    TUsers login(String username, String password);

    /**
     * 根据主键更新user对象
     * @param userVo
     * @return
     */
    void updateByUid(TUsers userVo);
}
