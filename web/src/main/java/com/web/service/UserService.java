package com.web.service;

import com.web.bo.UserBO;
import com.web.vo.UserVO;

import java.util.List;

/**
 * @author LuHailun
 * @Title: UserService
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/19 12:04
 */
public interface UserService {

    List<UserVO> findALl();

    UserVO getOne(int id);

    void saveUser(UserBO userBO);

    void udpateUser(UserBO userBO);

    void deleteUser(int id);
}
