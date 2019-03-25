package com.yunque.www.springbootdemo.service.serviceimpl;

import com.yunque.www.springbootdemo.mapper.SysUserMapper;
import com.yunque.www.springbootdemo.pojo.SysUser;
import com.yunque.www.springbootdemo.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 2019/3/25.
 * author:crs
 * Description:SysUserServiceImpl
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public SysUser selectSysUserById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
