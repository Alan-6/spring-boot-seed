package com.web.service;

import com.web.bo.RoleBO;
import com.web.dao.entity.RoleEntity;
import com.web.dao.repositories.RoleRepository;
import com.web.vo.RoleVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author LuHailun
 * @Title: RoleServiceImpl
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:52
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<RoleVO> findALl() {

        List<RoleEntity> entities = roleRepository.findAll();
        List<RoleVO> vos = entities.stream().map(entity -> {
            RoleVO vo = new RoleVO();
            BeanUtils.copyProperties(entity, vo, "users", "permissions");
            return vo;
        }).collect(Collectors.toList());

        return vos;
    }

    @Override
    public RoleVO getOne(int id) {
        RoleEntity entity = roleRepository.getOne(id);
        RoleVO vo = new RoleVO();
        BeanUtils.copyProperties(entity, vo, "users", "permissions");
        return vo;
    }

    @Override
    public void saveRole(RoleBO roleBO) {
        RoleEntity entity = new RoleEntity();
        BeanUtils.copyProperties(roleBO, entity, "users", "permissions");
        roleRepository.save(entity);
    }

    @Override
    public void udpateRole(RoleBO roleBO) {
        RoleEntity entity = new RoleEntity();
        BeanUtils.copyProperties(roleBO, entity, "users", "permissions");
        roleRepository.save(entity);
    }

    @Override
    public void deleteRole(int id) {
        roleRepository.deleteById(id);
    }
}
