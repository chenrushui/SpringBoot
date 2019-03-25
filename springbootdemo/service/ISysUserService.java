package com.yunque.www.springbootdemo.service;

import com.yunque.www.springbootdemo.pojo.SysUser;

/**
 * Created on 2019/3/25.
 * author:crs
 * Description:ISysUserService
 */
public interface ISysUserService {

    SysUser selectSysUserById(Long id);
}
