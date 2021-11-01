package com.example.util;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SecurityUtils {

//    private static SecurityUtils securityUtils;
//
//    public static SecurityUtils getInstance () {
//        if (securityUtils != null) {
//            return securityUtils;
//        }
//        return new SecurityUtils();
//    }

    public static List<String> getAuthorities() {
        List<String> result = new ArrayList<>();
        List<GrantedAuthority> authorities = (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        for (GrantedAuthority authority : authorities) {
            result.add(authority.getAuthority());
        }
        return result;
    }

    public static String getPrincipal () {
        String principal = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal == null)
            return null;
        else
            return principal;
    }
}
