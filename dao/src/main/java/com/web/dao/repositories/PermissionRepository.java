package com.web.dao.repositories;

import com.web.dao.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LuHailun
 * @Title: PermissionRepository
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 9:06
 */
public interface PermissionRepository extends JpaRepository<PermissionEntity, Integer> {
}
