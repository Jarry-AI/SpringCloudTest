//package com.example.easyexcel.service.impl;
//
//
//import com.example.easyexcel.model.AuthUser;
//import com.example.easyexcel.service.AuthUserService;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 用户服务实现类
// */
//@Service
//public class AuthUserServiceImpl implements AuthUserService {
//
//    /**
//     * 通过用户账号获取用户信息
//     */
//    @Override
//    public AuthUser getAuthUserByUsername(String username) {
//        /**
//         * 实际上这里应该是从数据库中查询或者是调用其它服务接口获取，
//         * 为了方便，这里直接创建用户信息
//         * admin用户拥有 ROLE_ADMIN 和 ROLE_EMPLOYEE 这两个角色
//         * employee用户拥有 ROLE_EMPLOYEE 这个角色
//         * temp用户没有角色
//         */
//        if(username.equals("admin")) {
//            AuthUser user = new AuthUser();
//            user.setId(1L);
//            user.setUsername("admin");
//            /**
//             * 密码为123（通过BCryptPasswordEncoderl加密后的密文）
//             */
//            user.setPassword("$2a$10$U6g06YmMfRJXcNfLP28TR.xy21u1A5kIeY/OZMKBDVMbn7PGJiaZS");
//            List<String> roles = new ArrayList<>();
//            roles.add("ROLE_ADMIN");
//            roles.add("ROLE_EMPLOYEE");
//            user.setRoles(roles);
//            return user;
//        } else if(username.equals("employee")) {
//            AuthUser user = new AuthUser();
//            user.setId(2L);
//            user.setUsername("employee");
//            /**
//             * 密码为123（通过BCryptPasswordEncoderl加密后的密文）
//             */
//            user.setPassword("$2a$10$U6g06YmMfRJXcNfLP28TR.xy21u1A5kIeY/OZMKBDVMbn7PGJiaZS");
//            List<String> roles = new ArrayList<>();
//            roles.add("ROLE_EMPLOYEE");
//            user.setRoles(roles);
//            return user;
//        } else if (username.equals("temp")) {
//            AuthUser user = new AuthUser();
//            user.setId(3L);
//            user.setUsername("temp");
//            /**
//             * 密码为123（通过BCryptPasswordEncoderl加密后的密文）
//             */
//            user.setPassword("$2a$10$U6g06YmMfRJXcNfLP28TR.xy21u1A5kIeY/OZMKBDVMbn7PGJiaZS");
//            List<String> roles = new ArrayList<>();
//            user.setRoles(roles);
//            return user;
//        } else {
//            return null;
//        }
//    }
//
//}