package com.web.service;

import com.web.bo.RoleBO;
import com.web.vo.RoleVO;

import java.util.List;

/**
 * @author LuHailun
 * @Title: RoleService
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:48
 */
public interface RoleService {

    List<RoleVO> findALl();

    RoleVO getOne(int id);

    void saveRole(RoleBO roleBO);

    void udpateRole(RoleBO roleBO);

    void deleteRole(int id);
}
