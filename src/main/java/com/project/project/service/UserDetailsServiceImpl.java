package com.project.project.service;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import com.project.project.model.Member;
import com.project.project.repository.MemberRepository;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final MemberRepository repository;

    public UserDetailsServiceImpl(MemberRepository repository){
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String m_user) throws UsernameNotFoundException{
        Optional<Member> user = repository.findById(m_user);

        UserBuilder builder = null;
        if(user.isPresent()){
            Member currentMember = user.get();
            builder = org.springframework.security.core.userdetails.User.withUsername(m_user);
            builder.password(currentMember.getM_pass());
            builder.roles(currentMember.getM_role()); // สำหรับบทบาทเราต้องแปลงเป็นสตริงก่อนใช้งาน
        }else{
            throw new UsernameNotFoundException("User not found.");
        }
        return builder.build();
    }
}