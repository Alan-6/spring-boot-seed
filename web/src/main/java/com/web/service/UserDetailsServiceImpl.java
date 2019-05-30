package com.web.service;

import com.web.dao.entity.RoleEntity;
import com.web.dao.entity.UserEntity;
import com.web.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuHailun
 * @Title: UserDetailsServiceImpl
 * @ProjectName seed
 * @Description: TODO
 * @date 2019/5/27 21:42
 */
@Service
@Primary
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByAccount(username);
        if (userEntity != null) {
            List<GrantedAuthority> authorities = new ArrayList<>();
            List<RoleEntity> roleEntities = userEntity.getRoles();
            for (RoleEntity roleEntity : roleEntities) {
                authorities.add(new SimpleGrantedAuthority(roleEntity.getRole()));
            }
            return new User(userEntity.getAccount(), userEntity.getPassword(), authorities);
        }
        throw new UsernameNotFoundException("User '" + username + "' not found.");
    }
}
