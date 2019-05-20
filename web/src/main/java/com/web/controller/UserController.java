package com.web.controller;

import com.web.bo.UserBO;
import com.web.service.UserService;
import com.web.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LuHailun
 * @Title: UserController
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 15:12
 */
@RestController
@Api(tags = "用户管理接口")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("获取所有用户")
    @GetMapping("/user")
    public List<UserVO> findAll() {
        return userService.findALl();
    }

    @ApiOperation("获取用户")
    @GetMapping("/user/{id}")
    public UserVO getOne(@PathVariable(name = "id") int id) {
        return userService.getOne(id);
    }

    @ApiOperation("新增用户")
    @PostMapping("/user")
    public void saveUser(@RequestBody UserBO bo) {
        userService.saveUser(bo);
    }

    @ApiOperation("修改用户")
    @PutMapping("/user")
    public void udpateUser(@RequestBody UserBO bo) {
        userService.udpateUser(bo);
    }

    @ApiOperation("删除用户")
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable(name = "id") int id) {
        userService.deleteUser(id);
    }
}
