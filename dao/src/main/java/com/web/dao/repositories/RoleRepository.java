package com.web.dao.repositories;

import com.web.dao.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LuHailun
 * @Title: RoleRepository
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 8:57
 */
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
}
