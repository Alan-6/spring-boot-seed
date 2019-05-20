package com.web.service;

import com.web.bo.RoleBO;
import com.web.bo.UserBO;
import com.web.dao.entity.RoleEntity;
import com.web.dao.entity.UserEntity;
import com.web.dao.repositories.RoleRepository;
import com.web.dao.repositories.UserRepository;
import com.web.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author LuHailun
 * @Title: UserServiceImpl
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 12:04
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<UserVO> findALl() {

        List<UserEntity> entities = userRepository.findAll();
        List<UserVO> vos = entities.stream().map(entity -> {
            UserVO vo = new UserVO();
            BeanUtils.copyProperties(entity, vo, "roles");
            return vo;
        }).collect(Collectors.toList());

        return vos;
    }

    @Override
    public UserVO getOne(int id) {

        UserEntity entity = userRepository.getOne(id);
        UserVO vo = new UserVO();
        BeanUtils.copyProperties(entity, vo, "roles");
        return vo;
    }

    @Override
    public void saveUser(UserBO userBO) {
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(userBO, entity, "roles");
        RoleBO roleBO = userBO.getRoles().get(0);

        RoleEntity roleEntity = new RoleEntity();
        BeanUtils.copyProperties(roleBO, roleEntity, "users", "permissions");
        List<RoleEntity> entities = new ArrayList<>();
        entities.add(roleEntity);
        entity.setRoles(entities);
        /*if (!userBO.getRoles().isEmpty()) {
            RoleEntity role = roleRepository.getOne(userBO.getRoles().get(0).getId());
            List<RoleEntity> entities = new ArrayList<>();
            entities.add(role);
            entity.setRoles(entities);
        }*/
        userRepository.save(entity);
    }

    @Override
    public void udpateUser(UserBO userBO) {
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(userBO, entity, "roles");
        userRepository.save(entity);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
