package com.web.controller;

import com.web.bo.RoleBO;
import com.web.service.RoleService;
import com.web.vo.RoleVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LuHailun
 * @Title: RoleController
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 16:32
 */
@RestController
@Api(tags = "角色管理接口")
public class RoleController {

    @Autowired
    RoleService roleService;

    @ApiOperation("获取所有角色")
    @GetMapping("/role")
    public List<RoleVO> findAll() {
        return roleService.findALl();
    }

    @ApiOperation("获取角色")
    @GetMapping("/role/{id}")
    public RoleVO getOne(@PathVariable(name = "id") int id) {
        return roleService.getOne(id);
    }

    @ApiOperation("新增角色")
    @PostMapping("/role")
    public void saveRole(@RequestBody RoleBO bo) {
        roleService.saveRole(bo);
    }

    @ApiOperation("修改角色")
    @PutMapping("/role")
    public void udpateRole(@RequestBody RoleBO bo) {
        roleService.udpateRole(bo);
    }

    @ApiOperation("删除角色")
    @DeleteMapping("/role/{id}")
    public void deleteRole(@PathVariable(name = "id") int id) {
        roleService.deleteRole(id);
    }
}
