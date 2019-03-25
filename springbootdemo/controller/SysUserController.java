package com.yunque.www.springbootdemo.controller;

import com.yunque.www.springbootdemo.pojo.BaseResult;
import com.yunque.www.springbootdemo.pojo.SysUser;
import com.yunque.www.springbootdemo.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2019/3/25.
 * author:crs
 * Description:SysUserController
 */
@RestController
@RequestMapping(value = "/sys")
public class SysUserController {

    @Autowired
    private ISysUserService iSysUserService;

    /**
     * 通过id获取用户信息
     * @param id
     * @return
     */
    @GetMapping(value = "/get/{id}",produces = "application/json;charset=utf-8")
    public BaseResult getSysUserById(@PathVariable Long id) {
        SysUser sysUser = iSysUserService.selectSysUserById(id);
        BaseResult baseResult = new BaseResult();
        baseResult.setResult(sysUser);
        baseResult.setMessage("请求成功");
        baseResult.setCode(200);
        return baseResult;
    }
}
