package com.yunque.www.springbootdemo.mapper;

import com.yunque.www.springbootdemo.pojo.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);
}