package com.web.dao.repositories;

import com.web.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LuHailun
 * @Title: UserRepository
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 8:25
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findById(int id);

}
