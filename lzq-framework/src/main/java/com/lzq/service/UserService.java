package com.lzq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzq.domain.ResponseResult;
import com.lzq.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2022-02-09 00:28:29
 */
public interface UserService extends IService<User> {

    ResponseResult userInfo();

}

