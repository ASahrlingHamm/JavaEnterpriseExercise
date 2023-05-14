package com.asahrlinghamm.individuelluppgiftjavaee.Services;

import com.asahrlinghamm.individuelluppgiftjavaee.Entities.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberServicesInterface {
    Member addMember(Member member);
    List<Member> getAllMembers();
    Member updateMember(Member member, int id);
    void deleteMember(int id);


}
