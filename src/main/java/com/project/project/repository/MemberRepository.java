package com.project.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.project.project.model.Member;
import java.util.List;



public interface MemberRepository extends JpaRepository<Member, String> {

}