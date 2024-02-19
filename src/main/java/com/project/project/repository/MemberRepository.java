package com.project.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.project.model.Member;

public interface MemberRepository extends JpaRepository<Member, String>{

}
