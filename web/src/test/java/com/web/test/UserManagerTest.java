package com.web.test;

import com.web.WebApplication;
import com.web.dao.entity.PermissionEntity;
import com.web.dao.entity.RoleEntity;
import com.web.dao.repositories.PermissionRepository;
import com.web.dao.repositories.RoleRepository;
import com.web.dao.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * @author LuHailun
 * @Title: UserManagerTest
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/18 20:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class UserManagerTest {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private EntityTransaction transaction;

    //@PersistenceContext
    //private EntityManager entityManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PermissionRepository permissionRepository;

    //@Before
    public void init() {
        /**
         * 通过Persistence获取EntityManagerFactory，
         * 传入参数对应配置文件中持久化单元persistence-unit的name
         * 通过EntityManagerFactory创建EntityManager
         * 获取EntityTransaction
         * 开启事务
         */
        entityManagerFactory = Persistence.createEntityManagerFactory("entityManagerFactory");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
        transaction.begin();
    }

    //@After
    public void distory() {
        /**
         * 提交事务
         * 关闭entityManager
         * 关闭entityManagerFactory
         */
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    @Test
    @Transactional
    @Rollback(false)
    public void test() {
        //UserEntity user = new UserEntity();
        /*UserEntity user = userRepository.findById(1);
        Date now = new Date();
        *//*user.setCreatedDate(now);
        user.setCreatedUser(1);
        user.setUpdatedDate(now);
        user.setUpdatedUser(1);
        user.setAccount("admin");
        user.setPassword("123456");
        user.setState(1);
        user.setUsername("管理员");*//*
        //entityManager.persist(user);
        //userRepository.save(user);
        user.setUpdatedDate(now);
        user.setUpdatedUser(1);
        //entityManager.merge(user);
        *//*RoleEntity role = new RoleEntity();
        role.setAvailable(1);
        role.setRole("admin");
        role.setDescription("管理员");
        role.setCreatedDate(now);
        role.setCreatedUser(1);
        role.setUpdatedDate(now);
        role.setUpdatedUser(1);
        List<UserEntity> users = new ArrayList<>();
        users.add(user);
        role.setUsers(users);*//*

        //roleRepository.save(role);

        RoleEntity role = roleRepository.getOne(1);

        PermissionEntity permission = new PermissionEntity();
        permission.setAvailable(1);
        permission.setName("更新用户");
        permission.setPermission("user:update");
        permission.setResourceType("button");
        permission.setUrl("/user/update");
        permission.setCreatedDate(now);
        permission.setCreatedUser(1);
        permission.setUpdatedDate(now);
        permission.setUpdatedUser(1);

        PermissionEntity permission1 = new PermissionEntity();
        permission1.setAvailable(1);
        permission1.setName("更新角色");
        permission1.setPermission("role:update");
        permission1.setResourceType("button");
        permission1.setUrl("/role/update");
        permission1.setCreatedDate(now);
        permission1.setCreatedUser(1);
        permission1.setUpdatedDate(now);
        permission1.setUpdatedUser(1);

        List<PermissionEntity> permissions = new ArrayList<>();
        List<PermissionEntity> permissions1 = permissionRepository.findAll();
        permissions1.get(0).setAvailable(1);
        permissions.add(permission);
        permissions.add(permission1);
        role.setPermissions(permissions1);
        roleRepository.save(role);*/

        List<PermissionEntity> permissionEntityList = permissionRepository.findAll();
        List<RoleEntity> roles = permissionEntityList.get(0).getRoles();
        System.out.println("a");
    }
}
