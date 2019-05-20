package com.web.service;

import com.web.bo.PermissionBO;
import com.web.vo.PermissionVO;

import java.util.List;

/**
 * @author LuHailun
 * @Title: PermissionService
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:49
 */
public interface PermissionService {

    List<PermissionVO> findALl();

    PermissionVO getOne(int id);

    void savePermission(PermissionBO permissionBO);

    void udpatePermission(PermissionBO permissionBO);

    void deletePermission(int id);
}
