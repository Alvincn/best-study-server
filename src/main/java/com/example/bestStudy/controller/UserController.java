package com.example.bestStudy.controller;
import com.example.bestStudy.dto.LoginFormDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.bestStudy.domain.User;
import com.example.bestStudy.service.IUserService;
import xin.altitude.cms.common.entity.AjaxResult;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import xin.altitude.cms.common.entity.PageEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RestController
@Api(value = "用户管理controller",tags = "用户管理接口")
@RequestMapping("/bestStudy/user")
public class UserController{
    @Autowired
    private IUserService userService;
//    @GetMapping("/page")
//    public AjaxResult page(PageEntity pageEntity,User user){
//        return AjaxResult.success(userService.page(pageEntity.toPage(), Wrappers.lambdaQuery(user)));
//    }
    @GetMapping("/list")
    public AjaxResult list(User user){
        return AjaxResult.success(userService.list(Wrappers.lambdaQuery(user)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody User user) {
        return AjaxResult.success(userService.save(user));
    }

    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody User user) {
        return AjaxResult.success(userService.updateById(user));
    }
    @ApiOperation("注销账号")
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(userService.removeByIds(Arrays.asList(ids)));
    }
    @ApiOperation("查询此账号信息")
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(userService.getById(id));
    }

    @ApiOperation("登录 loginFormDTO 表单需要含有邮箱,验证码  或者邮箱，密码")
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginFormDTO loginFormDTO, HttpSession session){
        //TODO
        return AjaxResult.success("");
    }
    @ApiOperation("登出")
    @PostMapping("/logout/")
    public AjaxResult logout(HttpSession session){
        //TODO
        return AjaxResult.success("");
    }
    @ApiOperation("修改密码 表单需要含有邮箱,验证码")
    @PostMapping("/rePassword")
    public AjaxResult rePassword(@RequestBody LoginFormDTO loginFormDTO){
        //TODO
        return AjaxResult.success("");
    }
}
