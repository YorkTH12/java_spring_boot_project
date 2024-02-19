package com.project.project;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.project.model.Member;
import com.project.project.repository.MemberRepository;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

	private final MemberRepository memberRepository;

	public ProjectApplication(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// Username: user, password: user
		memberRepository.save(new Member("member03", "สมยอส กินเป็ด", "abc3333","0833333333","ADMIN"));
		// Username: admin, password: admin
		memberRepository.save(new Member("member04", "สมยอส กินเป็ด", "abc4444","0844444444","USER"));
	}
	

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
