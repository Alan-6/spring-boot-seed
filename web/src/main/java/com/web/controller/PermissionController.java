package com.web.controller;

import com.web.bo.PermissionBO;
import com.web.service.PermissionService;
import com.web.vo.PermissionVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LuHailun
 * @Title: PermissionController
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 15:12
 */
@RestController
@Api(tags = "权限管理接口")
public class PermissionController {

    @Autowired
    PermissionService permissionService;

    @ApiOperation("获取所有权限")
    @GetMapping("/permission")
    public List<PermissionVO> findAll() {
        return permissionService.findALl();
    }

    @ApiOperation("获取权限")
    @GetMapping("/permission/{id}")
    public PermissionVO getOne(@PathVariable(name = "id") int id) {
        return permissionService.getOne(id);
    }

    @ApiOperation("新增权限")
    @PostMapping("/permission")
    public void savePermission(@RequestBody PermissionBO bo) {
        permissionService.savePermission(bo);
    }

    @ApiOperation("修改权限")
    @PutMapping("/permission")
    public void udpatePermission(@RequestBody PermissionBO bo) {
        permissionService.udpatePermission(bo);
    }

    @ApiOperation("删除权限")
    @DeleteMapping("/permission/{id}")
    public void deletePermission(@PathVariable(name = "id") int id) {
        permissionService.deletePermission(id);
    }
}
