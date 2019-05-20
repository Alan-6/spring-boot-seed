package com.web.service;

import com.web.bo.PermissionBO;
import com.web.dao.entity.PermissionEntity;
import com.web.dao.repositories.PermissionRepository;
import com.web.vo.PermissionVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author LuHailun
 * @Title: PermissionServiceImpl
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 14:53
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public List<PermissionVO> findALl() {
        List<PermissionEntity> entities = permissionRepository.findAll();
        List<PermissionVO> vos = entities.stream().map(entity -> {
            PermissionVO vo = new PermissionVO();
            BeanUtils.copyProperties(entity, vo, "roles");
            return vo;
        }).collect(Collectors.toList());
        return vos;
    }

    @Override
    public PermissionVO getOne(int id) {
        PermissionEntity entity = permissionRepository.getOne(id);
        PermissionVO vo = new PermissionVO();
        BeanUtils.copyProperties(entity, vo, "roles");
        return vo;
    }

    @Override
    public void savePermission(PermissionBO permissionBO) {
        PermissionEntity entity = new PermissionEntity();
        BeanUtils.copyProperties(permissionBO, entity, "roles");
        permissionRepository.save(entity);
    }

    @Override
    public void udpatePermission(PermissionBO permissionBO) {

        PermissionEntity entity = new PermissionEntity();
        BeanUtils.copyProperties(permissionBO, entity, "roles");
        permissionRepository.save(entity);
    }

    @Override
    public void deletePermission(int id) {
        permissionRepository.deleteById(id);
    }
}
