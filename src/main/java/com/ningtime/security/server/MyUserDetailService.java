package com.ningtime.security.server;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import
        org.springframework.security.core.userdetails.UsernameNotFoundException;
/**
 * @author
 * @version 1.0
 * @description
 * @date 18/4/13
 */
public class MyUserDetailService implements UserDetailsService {
    /**
     * loadUserByUsername: 读取用户信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws
            UsernameNotFoundException {
//UserDetails: 封装用户数据的接口
        User user = new User( "lining","123456",
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
        return user;
    }
}
