package com.jeju.be_final.domain.member.repository;

import com.jeju.be_final.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
