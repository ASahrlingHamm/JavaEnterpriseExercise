package com.asahrlinghamm.individuelluppgiftjavaee.Repositories;

import com.asahrlinghamm.individuelluppgiftjavaee.Entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
