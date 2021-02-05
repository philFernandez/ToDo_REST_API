package com.googhcl.hellojwt.service;

import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        if ("javainuse".equals(username)) {
            return new User("javainuse",
                    "$2a$10$dQ3gDpugB2LrY4.cspLHjOkK28Oatwb4fT/tdwTkgNofm/iJywTKm",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("No user named " + username);
        }
    }

}
