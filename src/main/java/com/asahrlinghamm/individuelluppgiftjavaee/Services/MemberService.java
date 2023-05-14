package com.asahrlinghamm.individuelluppgiftjavaee.Services;

import com.asahrlinghamm.individuelluppgiftjavaee.Entities.Address;
import com.asahrlinghamm.individuelluppgiftjavaee.Entities.Member;
import com.asahrlinghamm.individuelluppgiftjavaee.Exceptions.ResourceNotFoundException;
import com.asahrlinghamm.individuelluppgiftjavaee.Repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements MemberServicesInterface{

    public Address address;
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }


    @Override
    public Member updateMember(Member member, int id) {
        Member m = memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Member", "Id", id));
        m.setFirstName(member.getFirstName());
        m.setLastName(member.getLastName());
        m.setAddress(member.getAddress());
        m.setEmail(member.getEmail());
        m.setPhoneNumber(member.getPhoneNumber());
        m.setDateOfBirth(member.getDateOfBirth());
        memberRepository.save(m);
        return m;
    }


    @Override
    public void deleteMember(int id) {
        memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
        memberRepository.deleteById(id);
    }


}
